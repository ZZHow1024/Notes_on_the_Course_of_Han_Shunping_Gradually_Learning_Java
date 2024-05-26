package com.zzhow.homework;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 2024/5/26
 *
 * @author ZZHow
 * 文件下载 - 服务器端
 */
public class Homework03Server {
    public static void main(String[] args) {
        System.out.println("---服务器端---");
        try (ServerSocket serverSocket = new ServerSocket(9999);
             Socket socket = serverSocket.accept();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
             OutputStream outputStream = socket.getOutputStream();
             PrintWriter writer = new PrintWriter(outputStream, true)) {
            System.out.println("已与客户端建立连接");

            // 读取客户端发送的要下载的文件名
            String downloadFileName = bufferedReader.readLine();
            System.out.println("客户端请求下载的文件名：" + downloadFileName);

            // 创建文件对象
            File downloadFile = new File("D:\\" + downloadFileName);

            // 判断文件是否存在
            if (downloadFile.exists()) {
                System.out.println("找到文件，开始传输");
                writer.println("找到文件，开始传输");

                FileInputStream fileInputStream = new FileInputStream(downloadFile);
                byte[] buffer = new byte[1024];
                int readLength;

                while ((readLength = fileInputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, readLength);
                }

                fileInputStream.close();
                socket.shutdownOutput();
            } else {
                writer.println("无此文件");
                System.out.println("无此文件");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("服务器端关闭，程序退出");
    }
}
