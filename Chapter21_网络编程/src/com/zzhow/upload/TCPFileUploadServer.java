package com.zzhow.upload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 2024/5/24
 *
 * @author ZZHow
 * 文件上传服务器端
 * 服务器端接收到客户端发送的图片，保存到 src 下，发送 “收到图片” 再退出
 */
public class TCPFileUploadServer {
    public static void main(String[] args) {
        final String destFilePath = "src\\hello.png";

        System.out.println("---服务器端---");
        System.out.println("正在监听 9999 端口，等待连接");

        try (ServerSocket serverSocket = new ServerSocket(9999);
             Socket socket = serverSocket.accept();
             BufferedInputStream bufferedInputStream = new BufferedInputStream(socket.getInputStream());
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(destFilePath));
             BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()))) {
            System.out.println("客户端已连接");

            //通过 socket 获取到输入流，接收客户端发来的 bytes
            byte[] bytes = StreamUtils.streamToByteArray(bufferedInputStream);

            //将 bytes 写入到指定路径，得到一个文件
            bufferedOutputStream.write(bytes);
            System.out.println("图片已接收");

            //向客户端发送 “收到图片”
            bufferedWriter.write("收到图片");
            bufferedWriter.flush();
            socket.shutdownOutput();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("服务器端关闭，程序退出");
    }
}
