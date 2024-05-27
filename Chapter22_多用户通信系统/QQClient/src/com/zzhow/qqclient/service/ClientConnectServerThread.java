package com.zzhow.qqclient.service;

import com.zzhow.qqcommon.Message;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 1.0
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
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("异常信息：" + e.getMessage());
            }
        }
    }
}
