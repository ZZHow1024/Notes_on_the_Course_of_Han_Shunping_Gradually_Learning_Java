package com.zzhow.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * 2024/5/24
 *
 * @author ZZHow
 */
public class UDPSenderB {
    public static void main(String[] args) {
        System.out.println("---UDPSenderB---");

        String message = "Hello";
        final String IP = "127.0.0.1";
        final int PORT = 9999;

        //创建 DatagramSocket 对象，准备在 9998 端口接收数据
        try (DatagramSocket datagramSocket = new DatagramSocket(9998)) {
            System.out.println("正在 9998 端口等待接收数据");
            //建立数据包对象
            DatagramPacket datagramPacket = new DatagramPacket(message.getBytes(), message.length()
                    , InetAddress.getByName(IP), PORT);

            //发送数据包
            datagramSocket.send(datagramPacket);
            System.out.println("发送完毕");

            //构建一个 DatagramPacket 对象，准备接收数据
            byte[] buffer = new byte[64 * 1024];
            DatagramPacket datagramPacket1 = new DatagramPacket(buffer, buffer.length);

            //准备接收数据，调用接收方法
            datagramSocket.receive(datagramPacket1);

            //把 datagramPacket 进行拆包
            byte[] data = datagramPacket1.getData();
            int length = datagramPacket1.getLength();
            String receiveMessage = new String(data, 0, length);
            System.out.println("---开始打印接收到的信息");
            System.out.println(receiveMessage);
            System.out.println("停止打印接收到的信息---");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("连接关闭，程序退出");
    }
}
