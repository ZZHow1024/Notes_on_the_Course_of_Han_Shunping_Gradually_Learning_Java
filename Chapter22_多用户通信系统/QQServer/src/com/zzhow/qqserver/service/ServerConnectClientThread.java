package com.zzhow.qqserver.service;

import com.zzhow.qqcommon.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 1.0
 * 与客户端保持通信的线程
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userID;

    public ServerConnectClientThread(Socket socket, String userID) {
        this.socket = socket;
        this.userID = userID;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println("等待接收客户端的数据");
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) objectInputStream.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("异常信息：" + e.getMessage());
                break;
            }
        }
    }
}
