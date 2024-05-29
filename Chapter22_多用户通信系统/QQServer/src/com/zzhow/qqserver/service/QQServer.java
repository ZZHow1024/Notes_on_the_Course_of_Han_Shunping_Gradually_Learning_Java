package com.zzhow.qqserver.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;
import com.zzhow.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 1.0
 */
public class QQServer {
    public static final int PORT = 9999;
    private ServerSocket serverSocket;
    private Socket socket;
    //创建集合，存放多个合法用户
    //ConcurrentHashMap 是线程安全的 HashMap
    private static ConcurrentHashMap<String, User> validUser = new ConcurrentHashMap<>();

    static {
        validUser.put("a", new User("a", "a"));
        validUser.put("b", new User("b", "b"));
        validUser.put("test", new User("test", "test"));
        validUser.put("admin", new User("admin", "admin"));
        validUser.put("101", new User("101", "1234"));
        validUser.put("102", new User("102", "2345"));
        validUser.put("103", new User("103", "3456"));
        validUser.put("104", new User("104", "4567"));
        validUser.put("105", new User("105", "5678"));
    }

    public QQServer() {
        System.out.println("===网络通讯系统（服务器端）===");

        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("服务器端已启动，正在" + PORT + "端口监听");

            //启动新闻推送服务
            new SendNewsToAll().start();

            while (true) {
                //如果没有客户端连接就会阻塞
                socket = serverSocket.accept();
                System.out.println("与一个客户端建立连接");
                //得到输入流与输出流
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                //得到发送来的 User 的对象
                User user = (User) objectInputStream.readObject();
                //验证登录
                Message message = new Message();
                if (checkUser(user.getUserID(), user.getPassword())) {
                    message.setMessageType(MessageType.MESSAGE_LOGIN_SUCCEEDED);
                    objectOutputStream.writeObject(message);
                    objectOutputStream.flush();
                    System.out.println("userID = \"" + user.getUserID() + "\"" + ", 登录成功");

                    //创建线程与客户端保持通信
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, user.getUserID());
                    serverConnectClientThread.start();

                    //将该线程对象放入集合中
                    ManageServerConnectClientThread.addServerConnectClientThread(user.getUserID(), serverConnectClientThread);
                } else {
                    message.setMessageType(MessageType.MESSAGE_LOGIN_FAILED);
                    objectOutputStream.writeObject(message);
                    objectOutputStream.flush();
                    socket.close();
                    System.out.println("userID = \"" + user.getUserID() + "\", password = \"" + user.getPassword() + "\", 登录失败");
                }
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } finally {
            //服务器端退出 while 循环，说明服务器端不再需要监听，关闭 ServerSocket
            try {
                if (socket != null)
                    serverSocket.close();
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    //验证用户方法
    private boolean checkUser(String userID, String password) {
        User user = validUser.get(userID);

        if (user == null)
            return false;

        if (password.equals(user.getPassword()))
            return true;

        return false;
    }

    //判断用户是否注册
    public static boolean isRegister(String userID) {
        return validUser.containsKey(userID);
    }
}
