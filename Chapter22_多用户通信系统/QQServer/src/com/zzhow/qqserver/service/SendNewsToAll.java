package com.zzhow.qqserver.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;
import com.zzhow.utils.Utility;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/**
 * 2024/5/29
 *
 * @author ZZHow
 * @Version 1.0
 * 服务器推送新闻服务
 */
public class SendNewsToAll extends Thread {
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

    @Override
    public void run() {
        while (true) {
            System.out.println("请输入要推送的消息：");
            String news = Utility.readString(500);

            //构建 Message 对象
            Message message = new Message();
            message.setMessageType(MessageType.MESSAGE_SERVER_REMINDER);
            message.setSender("服务器");
            message.setSendTime(simpleDateFormat.format(new Date()));
            message.setContent(news);

            //遍历所有通信线程
            HashMap<String, ServerConnectClientThread> hashMap = ManageServerConnectClientThread.getHashMap();
            Iterator<String> iterator = hashMap.keySet().iterator();
            while (iterator.hasNext()) {
                String receiver = iterator.next();
                Socket socket = hashMap.get(receiver).getSocket();
                try {
                    ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                    objectOutputStream.writeObject(message);
                } catch (IOException e) {
                    System.out.println("异常信息：" + e.getMessage());
                }
            }
        }
    }
}
