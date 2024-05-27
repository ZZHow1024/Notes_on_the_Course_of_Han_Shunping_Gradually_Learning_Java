package com.zzhow.qqserver.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;
import com.zzhow.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

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

    public QQServer() {
        try {
            serverSocket = new ServerSocket(PORT);
            System.out.println("服务器端已启动，正在" + PORT + "端口监听");

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
                if ("admin".equals(user.getUserID()) && "000".equals(user.getPassword())) {
                    message.setMessageType(MessageType.MESSAGE_LOGIN_SUCCEEDED);
                    System.out.println(user.getUserID() + " 登录成功");

                    //创建线程与客户端保持通信
                    ServerConnectClientThread serverConnectClientThread = new ServerConnectClientThread(socket, user.getUserID());
                    serverConnectClientThread.start();

                    //将该线程对象放入集合中
                    ManageServerConnectClientThread.addServerConnectClientThread(user.getUserID(), serverConnectClientThread);
                } else {
                    message.setMessageType(MessageType.MESSAGE_LOGIN_FAILED);
                    socket.close();
                    System.out.println(user.getUserID() + "登录失败");
                }
                objectOutputStream.writeObject(message);
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
}
