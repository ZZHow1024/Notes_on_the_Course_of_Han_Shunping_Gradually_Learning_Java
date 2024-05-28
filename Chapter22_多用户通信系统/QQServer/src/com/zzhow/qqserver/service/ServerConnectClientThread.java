package com.zzhow.qqserver.service;

import com.zzhow.qqcommon.Message;
import com.zzhow.qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 3.0
 * 与客户端保持通信的线程
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userID;

    public ServerConnectClientThread(Socket socket, String userID) {
        this.socket = socket;
        this.userID = userID;
    }

    public Socket getSocket() {
        return socket;
    }

    @Override
    public void run() {
        loop:
        while (true) {
            try {
                System.out.println("等待接收客户端的数据");
                ObjectInputStream objectInputStream = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) objectInputStream.readObject();

                switch (message.getMessageType()) {
                    case MessageType.MESSAGE_GET_FRIEND -> {
                        System.out.println("用户 " + message.getSender() + " 请求拉取在线用户列表");

                        //构建 Message 对象
                        Message onlineUsersListMessage = new Message();
                        onlineUsersListMessage.setMessageType(MessageType.MESSAGE_RES_FRIEND);
                        onlineUsersListMessage.setReceiver(message.getSender());
                        onlineUsersListMessage.setContent(ManageServerConnectClientThread.getOnlineUsersList());

                        //返回给客户端
                        ObjectOutputStream objectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                        objectOutputStream.writeObject(onlineUsersListMessage);
                    }
                    case MessageType.MESSAGE_CLIENT_LOGOUT -> {
                        //将当前用户线程从集合中移除
                        ManageServerConnectClientThread.removeServerConnectClientThread(message.getSender());
                        //关闭 socket 连接
                        socket.close();
                        System.out.println("用户 " + message.getSender() + " 登出");
                        //退出当前线程
                        break loop;
                    }
                    case MessageType.MESSAGE_COMMON -> {
                        Message reminderMessage = new Message();
                        reminderMessage.setMessageType(MessageType.MESSAGE_SERVER_REMINDER);

                        Message forwardMessage = new Message();
                        forwardMessage.setMessageType(MessageType.MESSAGE_COMMON);
                        forwardMessage.setSender(message.getSender());
                        forwardMessage.setContent(message.getContent());
                        forwardMessage.setSendTime(message.getSendTime());

                        //判断指定用户是否在线
                        if (ManageServerConnectClientThread.isOnline(message.getReceiver())) {
                            //根据 message 中的 receiver 获取对应的通信线程
                            Socket receiverSocket = ManageServerConnectClientThread.getServerConnectClientThread(message.getReceiver()).getSocket();
                            ObjectOutputStream receiverObjectOutputStream = new ObjectOutputStream(receiverSocket.getOutputStream());
                            receiverObjectOutputStream.writeObject(forwardMessage);

                            //构建提醒消息
                            reminderMessage.setContent("发送成功");
                            System.out.println("用户 " + message.getSender() + " 对用户 " + message.getReceiver() + " 发送了一个私聊消息");
                        } else {
                            //构建提醒消息
                            reminderMessage.setContent("用户 " + message.getReceiver() + " 不在线，发送失败");
                            System.out.println("用户 " + message.getSender() + " 对用户 " + message.getReceiver() + " 发送的私聊消息失败，接收方不在线");
                        }

                        //回复客户端发送状态
                        ObjectOutputStream senderObjectOutputStream = new ObjectOutputStream(socket.getOutputStream());
                        senderObjectOutputStream.writeObject(reminderMessage);
                    }
                    case null, default -> System.out.println("暂不处理");
                }
            } catch (IOException | ClassNotFoundException e) {
                System.out.println("用户 " + userID + " 发生异常，异常信息：" + e.getMessage());
                ManageServerConnectClientThread.removeServerConnectClientThread(userID);
                break;
            }
        }
    }
}
