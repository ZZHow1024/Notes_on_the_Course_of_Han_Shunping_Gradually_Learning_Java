package com.zzhow.qqclient.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 2024/5/28
 *
 * @author ZZHow
 * @Version 1.0
 * 提供与消息相关的服务
 */
public class MessageClientService {
    private final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

    /**
     * @param sender   发送者
     * @param receiver 接收者
     * @param content  消息内容
     */
    public void sendMessage(String sender, String receiver, String content) {
        //构建 Message 对象
        Message message = new Message();
        message.setSender(sender);
        message.setReceiver(receiver);
        message.setContent(content);
        message.setMessageType(MessageType.MESSAGE_COMMON);
        message.setSendTime(simpleDateFormat.format(new Date())); //发送时间

        //发送给服务器
        Socket socket = ManageClientConnectServerThread.getClientConnectServerThread(sender).getSocket();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
            objectOutputStream.writeObject(message);
            System.out.println("已发送");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
