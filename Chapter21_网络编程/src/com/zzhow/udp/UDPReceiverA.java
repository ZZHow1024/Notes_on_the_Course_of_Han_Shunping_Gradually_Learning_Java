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
public class UDPReceiverA {
    public static void main(String[] args) {
        System.out.println("---UDPReceiverA---");

        String message = "World";
        final String IP = "127.0.0.1";
        final int PORT = 9998;

        //创建 DatagramSocket 对象，准备在 9999 端口接收数据
        try (DatagramSocket datagramSocket = new DatagramSocket(9999)) {
            System.out.println("正在 9999 端口等待接收数据");
            //构建一个 DatagramPacket 对象，准备接收数据
            //  UDP 协议一个数据包最大就是 64 KB
            byte[] buffer = new byte[64 * 1024];
            DatagramPacket datagramPacket = new DatagramPacket(buffer, buffer.length);

            //准备接收数据，调用接收方法
            //  若没有数据包发送到本机的 9999 端口时就会阻塞
            datagramSocket.receive(datagramPacket); //将接收到的数据 填充到 datagramPacket 中

            //把 datagramPacket 进行拆包
            int length = datagramPacket.getLength(); //实际接收到的数据长度
            byte[] data = datagramPacket.getData(); //接收到的数据
            String receiveMessage = new String(data, 0, length);
            System.out.println("---开始打印接收到的信息");
            System.out.println(receiveMessage);
            System.out.println("停止打印接收到的信息---");

            //建立数据包对象
            DatagramPacket datagramPacket1 = new DatagramPacket(message.getBytes(), message.length(), InetAddress.getByName(IP), PORT);

            //发送数据包
            datagramSocket.send(datagramPacket1);
            System.out.println("发送完毕");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("连接关闭，程序退出");
    }
}
