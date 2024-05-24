package com.zzhow.upload;

import java.io.*;
import java.net.Socket;

/**
 * 2024/5/24
 *
 * @author ZZHow
 * 文件上传客户端
 * 客户端连接到服务端，发送一张图片 D:\hello.png
 */
public class TCPFileUploadClient {
    public static void main(String[] args) {
        final String IP = "127.0.0.1";
        final int PORT = 9999;
        final String filePath = "D:\\hello.png";

        System.out.println("---客户端---");

        try (Socket socket = new Socket(IP, PORT);
             BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(filePath));
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(socket.getOutputStream());
             InputStream inputStream = socket.getInputStream()) {
            System.out.println("已连接服务器端");
            //将图片读到 byte 数组中
            byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

            //通过 socket 获取到输出流，将 bytes 数据发送到服务器端
            bufferedOutputStream.write(bytes);
            socket.shutdownOutput();
            System.out.println("图片已发送");

            //接收服务器端发来的消息
            System.out.println("---开始打印服务器端消息");
            String serverMessage = StreamUtils.streamToString(inputStream);
            System.out.print(serverMessage);
            System.out.println("停止打印服务器端消息---");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("客户端关闭，程序退出");
    }
}
