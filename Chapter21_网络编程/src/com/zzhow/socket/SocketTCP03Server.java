package com.zzhow.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 2024/5/20
 *
 * @author ZZHow
 * 服务器端
 * 服务器端接收到客户端发送的信息，输出，然后退出
 * 向客户端发送 “Hello, client!”
 * 补充：使用字符流
 */
public class SocketTCP03Server {
    public static void main(String[] args) {
        String message = "Hello, client!";

        System.out.println("---服务器端---");
        System.out.println("正在监听 9999 端口，等待连接");

        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            // 阻塞等待客户端连接
            try (Socket socket = serverSocket.accept();
                 InputStream inputStream = socket.getInputStream();
                 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                 OutputStream outputStream = socket.getOutputStream();
                 BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream))) {

                System.out.println("客户端已连接");

                // 补充：使用字符流读取客户端数据并打印
                System.out.println("开始打印信息---");
                String readMessage = bufferedReader.readLine();
                System.out.print(readMessage);
                System.out.println("\n---停止打印信息");

                // 补充：使用字符流向客户端发送信息
                bufferedWriter.write(message);
                // 补充：使用 bufferedWriter.newLine() 设置结束标记
                bufferedWriter.newLine(); //表示写入内容结束
                bufferedWriter.flush(); //如果使用字符流，需要手动刷新
            } catch (IOException e) {
                System.err.println("客户端通信发生错误: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("服务器启动失败: " + e.getMessage());
        }

        System.out.println("服务器端关闭，程序退出");
    }
}
