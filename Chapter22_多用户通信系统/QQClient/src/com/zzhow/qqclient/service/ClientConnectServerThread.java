package com.zzhow.qqclient.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 2.0
 * 与服务器端保持通信的线程
 */
public class ClientConnectServerThread extends Thread {
    private Socket socket;

    public ClientConnectServerThread(Socket socket) {
        this.socket = socket;
    }

    public Socket getSocket() {
        return socket;
    }

    public void setSocket(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //Thread 需要在后台与服务器通信
        while (true) {
            //若服务器没有发送 Message 对象，线程会阻塞在这里
            try {
                System.out.println("等待接收服务器端的数据");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();

                switch (message.getMessageType()) {
                    case MessageType.MESSAGE_RES_FRIEND -> {
                        String[] onlineUsers = message.getContent().split(",");
                        System.out.println("\n---在线用户列表---");
                        System.out.println("序号\t\t用户名");
                        for (int i = 0; i < onlineUsers.length; i++) {
                            System.out.println((i + 1) + "\t\t" + onlineUsers[i]);
                        }
                    }
                    case null, default -> System.out.println("暂不处理");
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("异常信息：" + e.getMessage());
                System.exit(-1);
            }
        }
    }
}
