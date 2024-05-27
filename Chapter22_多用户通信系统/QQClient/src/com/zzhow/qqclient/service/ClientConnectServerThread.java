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
    private Socket socket = null;
    private ObjectInputStream oos = null;

    {
        try {
            oos = new ObjectInputStream(socket.getInputStream());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

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
                Message message = (Message) oos.readObject();
            } catch (IOException | ClassNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
