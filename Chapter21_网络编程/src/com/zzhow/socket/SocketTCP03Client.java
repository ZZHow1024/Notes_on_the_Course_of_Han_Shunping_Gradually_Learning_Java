package com.zzhow.socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * 2024/5/22
 *
 * @author ZZHow
 * 客户端
 * 客户端连接到服务器端，发送 “Hello, server!”，然后退出
 * 接收服务器端发来的消息并输出
 * 补充：使用字符流
 */
public class SocketTCP03Client {
    public static void main(String[] args) {
        String message = "Hello, server!";

        System.out.println("---客户端---");
        // 使用 try-with-resources 语句管理资源
        try (Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
             OutputStream outputStream = socket.getOutputStream();
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
             InputStream inputSteam = socket.getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputSteam))) {

            System.out.println("服务器端连接成功");

            // 补充：使用字符流发送消息
            bufferedWriter.write(message);

            // 补充：使用 bufferedWriter.newLine() 设置结束标记
            bufferedWriter.newLine(); //表示写入内容结束
            bufferedWriter.flush(); //如果使用字符流，需要手动刷新
            System.out.println("发送成功");

            // 接收服务器发来的消息
            System.out.println("开始打印信息---");
            String readMessage = bufferedReader.readLine();
            System.out.print(readMessage);
            System.out.println("\n---停止打印信息");
        } catch (IOException e) {
            System.err.println("I/O 错误: " + e.getMessage());
        }

        System.out.println("客户端关闭，程序退出");
    }
}
