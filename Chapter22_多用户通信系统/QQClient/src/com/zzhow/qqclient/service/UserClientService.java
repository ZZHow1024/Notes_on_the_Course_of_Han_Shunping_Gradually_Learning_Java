package com.zzhow.qqclient.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;
import com.zzhow.qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 1.0
 * 完成用户登录验证和用户注册等功能
 */
public class UserClientService {
    public static final String IP = "127.0.0.1";
    public static final int PORT = 9999;
    public User user; //用户对象
    public Socket socket;

    public boolean connectServer() {
        try {
            Socket socket = new Socket(InetAddress.getByName(IP), PORT);
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }

    public boolean checkUser(String userID, String password) {
        //创建用户对象
        user = new User(userID, password);

        //连接服务器
        int cnt = 0;
        while (true) {
            if (this.connectServer()) {
                System.out.println("连接服务器成功");
                break;
            } else if (cnt == 2) {
                System.out.println("第 " + (++cnt) + " 次连接服务器失败，网络异常");
                return false;
            } else
                System.out.println("第 " + (++cnt) + " 次连接服务器失败，3s 后重试");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        //发送 user 对象
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
             ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream())) {
            //发送对象
            objectOutputStream.writeObject(user);

            //读取从服务端回复的对象
            Message message = (Message) objectInputStream.readObject();

            //判断是否登录成功
            if (MessageType.MESSAGE_LOGIN_SUCCEEDED.equals(message.getMessageType())) {
                //创建与服务器端保持通信的线程 -> 再创建一个类 ClientConnectServerThread
                ClientConnectServerThread clientConnectServerThread = new ClientConnectServerThread(socket);
                //启动客户端线程
                clientConnectServerThread.start();
                //为了方便扩展，将线程放入集合中管理
                ManageClientConnectServerThread.addClientConnectServerThread(userID, clientConnectServerThread);

                return true;
            } else {
                socket.close();
                return false;
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return false;
    }
}
