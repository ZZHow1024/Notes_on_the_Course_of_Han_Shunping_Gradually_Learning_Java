package com.zzhow.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 2024/5/22
 *
 * @author ZZHow
 * 客户端
 * 客户端连接到服务器端，发送 “Hello, server!”，然后退出
 */
public class SocketTCP01Client {
    public static void main(String[] args) {
        String message = "Hello, server!";

        System.out.println("---客户端---");
        // 使用 try-with-resources 语句管理资源
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
             OutputStream outputStream = socket.getOutputStream()) {

            System.out.println("服务端连接成功");

            // 发送消息
            outputStream.write(message.getBytes());
            System.out.println("发送成功");
        } catch (IOException e) {
            System.err.println("I/O 错误: " + e.getMessage());
        }

        System.out.println("客户端关闭，程序退出");
    }
}

/* 以下为分步写法
public class SocketTCP01Client {
    public static void main(String[] args) {
        String message = "Hello, server!";

        //1. 连接服务端
        Socket socket = null;
        try {
            socket = new Socket(InetAddress.getLocalHost(), 9999);
            System.out.println("服务端连接成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //2. 生成 Socket 对象，通过 socket.getOutputStream() 得到和 socket 对象关联的输出流对象
        try (OutputStream outputStream = socket.getOutputStream()) {
            outputStream.write(message.getBytes());
            System.out.println("发送成功");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //3. 关闭连接
        try {
            socket.close();
            System.out.println("连接关闭，程序退出");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/
