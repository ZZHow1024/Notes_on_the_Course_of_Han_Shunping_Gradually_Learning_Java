package com.zzhow.homework;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * 2024/5/26
 *
 * @author ZZHow
 */
public class Homework03Client {
    public static void main(String[] args) {
        final String IP = "127.0.0.1";
        final int PORT = 9999;
        Scanner scanner = new Scanner(System.in);

        System.out.println("---客户端---");
        try (Socket socket = new Socket(IP, PORT);
             PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
             InputStream inputStream = socket.getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream))) {
            System.out.println("服务器连接成功");
            System.out.print("请输入要下载的文件名：");
            String downloadFileName = scanner.next();

            // 发送文件名到服务器
            printWriter.println(downloadFileName);

            // 接收服务器的响应消息
            String serverMessage = bufferedReader.readLine();
            System.out.println("服务器消息：" + serverMessage);

            if ("找到文件，开始传输".equals(serverMessage)) {
                // 接收文件
                FileOutputStream fileOutputStream = new FileOutputStream("src\\" + downloadFileName);
                byte[] buffer = new byte[1024];
                int readLength = 0;

                while ((readLength = inputStream.read(buffer)) != -1) {
                    fileOutputStream.write(buffer, 0, readLength);
                }

                fileOutputStream.close();
                System.out.println("文件接收成功");
            } else {
                System.out.println("服务器无此文件");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("客户端关闭，程序退出");
    }
}
