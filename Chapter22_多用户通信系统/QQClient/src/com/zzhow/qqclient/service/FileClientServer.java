package com.zzhow.qqclient.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2024/5/29
 *
 * @author ZZHow
 * @Version 1.0
 * 文件传输服务
 */
public class FileClientServer {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

    public void sendFileToOne(String src, String dest, String sender, String receiver) {
        //读取 src 文件
        File file = new File(src);
        if (!file.exists()) {
            System.out.println("文件不存在！");
            return;
        }

        Message message = new Message();
        message.setMessageType(MessageType.MESSAGE_FILE);
        message.setSender(sender);
        message.setReceiver(receiver);
        message.setFileName(file.getName());
        message.setDest(dest);
        message.setSendTime(simpleDateFormat.format(new Date()));

        byte[] bytes = new byte[(int) file.length()];
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            fileInputStream.read(bytes);
            message.setFile(bytes);
        } catch (IOException e) {
            System.out.println("读取文件异常：" + e.getMessage());
        }

        //发送给服务器
        try {
            ObjectOutputStream objectOutputStream
                    = new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServerThread(sender).getSocket().getOutputStream());
            objectOutputStream.writeObject(message);
        } catch (IOException e) {
            System.out.println("文件发送异常：" + e.getMessage());
        }
    }
}
