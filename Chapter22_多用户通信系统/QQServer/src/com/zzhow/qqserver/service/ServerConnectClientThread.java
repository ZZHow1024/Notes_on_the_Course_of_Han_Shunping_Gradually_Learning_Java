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
 * @Version 2.0
 * 与客户端保持通信的线程
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userID;

    public ServerConnectClientThread(Socket socket, String userID) {
        this.socket = socket;
        this.userID = userID;
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
