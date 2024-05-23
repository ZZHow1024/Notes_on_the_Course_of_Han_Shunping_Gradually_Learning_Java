package com.zzhow.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 2024/5/20
 *
 * @author ZZHow
 * 服务器端
 * 服务器端接收到客户端发送的信息，输出，然后退出
 * 补充：向客户端发送 “Hello, client!”
 */
public class SocketTCP02Server {
    public static void main(String[] args) {
        String message = "Hello, client!";

        System.out.println("---服务器端---");
        System.out.println("正在监听 9999 端口，等待连接");

        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            // 阻塞等待客户端连接
            try (Socket socket = serverSocket.accept();
                 InputStream inputStream = socket.getInputStream();
                 OutputStream outputStream = socket.getOutputStream()) {

                System.out.println("客户端已连接");

                // 读取客户端数据并打印
                byte[] buffer = new byte[1024];
                int readLength;
                System.out.println("开始打印信息---");
                while ((readLength = inputStream.read(buffer)) != -1) {
                    System.out.print(new String(buffer, 0, readLength));
                }
                System.out.println("\n---停止打印信息");

                // 补充：向客户端发送信息
                outputStream.write(message.getBytes());
                // 补充：设置结束标记
                socket.shutdownOutput();
            } catch (IOException e) {
                System.err.println("客户端通信发生错误: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("服务器启动失败: " + e.getMessage());
        }

        System.out.println("服务器端关闭，程序退出");
    }
}
