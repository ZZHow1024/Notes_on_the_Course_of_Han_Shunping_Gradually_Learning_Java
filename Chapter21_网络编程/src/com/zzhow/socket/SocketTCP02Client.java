package com.zzhow.socket;

import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 2024/5/22
 *
 * @author ZZHow
 * 客户端
 * 客户端连接到服务器端，发送 “Hello, server!”，然后退出
 * 补充：接收服务器端发来的消息并输出
 */
public class SocketTCP02Client {
    public static void main(String[] args) {
        String message = "Hello, server!";

        System.out.println("---客户端---");
        // 使用 try-with-resources 语句管理资源
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
             OutputStream outputStream = socket.getOutputStream();
             InputStream inputSteam = socket.getInputStream()) {

            System.out.println("服务器端连接成功");

            // 发送消息
            outputStream.write(message.getBytes());
            // 补充：设置结束标记
            socket.shutdownOutput();
            System.out.println("发送成功");

            // 补充：接收服务器发来的消息
            byte[] buffer = new byte[1024];
            int readLength = 0;
            System.out.println("开始打印信息---");
            while ((readLength = inputSteam.read(buffer)) != -1) {
                System.out.print(new String(buffer, 0, readLength));
            }
            System.out.println("\n---停止打印信息");
        } catch (IOException e) {
            System.err.println("I/O 错误: " + e.getMessage());
        }

        System.out.println("客户端关闭，程序退出");
    }
}
