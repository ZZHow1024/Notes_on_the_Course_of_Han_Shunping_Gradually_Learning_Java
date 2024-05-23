package com.zzhow.socket;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 2024/5/20
 *
 * @author ZZHow
 * 服务端
 * 服务器端接收到客户端发送的信息，输出，然后退出
 */
public class SocketTCP01Server {
    public static void main(String[] args) {
        System.out.println("---服务端---");
        System.out.println("正在监听 9999 端口，等待连接");

        try (ServerSocket serverSocket = new ServerSocket(9999)) {
            // 阻塞等待客户端连接
            try (Socket socket = serverSocket.accept();
                 InputStream inputStream = socket.getInputStream()) {

                System.out.println("客户端已连接");

                // 读取客户端数据并打印
                byte[] buffer = new byte[1024];
                int readLength;
                System.out.println("开始打印信息---");
                while ((readLength = inputStream.read(buffer)) != -1) {
                    System.out.print(new String(buffer, 0, readLength));
                }
                System.out.println("\n---停止打印信息");

            } catch (IOException e) {
                System.err.println("客户端通信发生错误: " + e.getMessage());
            }
        } catch (IOException e) {
            System.err.println("服务器启动失败: " + e.getMessage());
        }

        System.out.println("服务端关闭，程序退出");
    }
}

/* 以下为分步写法
public class SocketTCP01Server {
    public static void main(String[] args) {
        //1. 本机 9999 端口监听，等待连接
        //要求本机没有其他服务监听 9999
        ServerSocket serverSocket = null;
        try {
            System.out.println("正在监听 9999 端口，等待连接");
            serverSocket = new ServerSocket(9999);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //2. 当没有客户端连接 9999 端口时，程序会阻塞，等待连接
        //  如果有客户端连接，则会返回 Socket 对象，程序继续
        Socket socket = null;
        try {
            socket = serverSocket.accept();
            System.out.println("socket accepted");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //3. 通过 socket.getInputStream 获得客户端写入到数据通道的数据，并显示
        try (InputStream inputStream = socket.getInputStream()) {
            byte[] buffer = new byte[1024];
            int readLength = 0;
            System.out.println("开始打印信息---");
            while ((readLength = inputStream.read(buffer)) != -1)
                System.out.print(new String(buffer, 0, readLength));
            System.out.println("\n---停止打印信息");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //4. 关闭连接
        try {
            socket.close();
            serverSocket.close();
            System.out.println("连接关闭，程序退出");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
*/
