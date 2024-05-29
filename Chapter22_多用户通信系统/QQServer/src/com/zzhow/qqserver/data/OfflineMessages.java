package com.zzhow.qqserver.data;

import com.zzhow.qqcommon.Message;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 2024/5/29
 *
 * @author ZZHow
 * @Version 1.0
 * 存储离线消息
 */
public class OfflineMessages {
    private static ConcurrentHashMap<String, ArrayList<Message>> offlineMessages = new ConcurrentHashMap<String, ArrayList<Message>>();

    public static void storingOfflineMessages(String userID, Message message) {
        if (offlineMessages.containsKey(userID)) {
            ArrayList<Message> messages = offlineMessages.get(userID);
            messages.add(message);
        } else {
            ArrayList<Message> messages = new ArrayList<>();
            messages.add(message);
            offlineMessages.put(userID, messages);
        }
        System.out.println("离线消息创建成功");
    }

    public static boolean hasOfflineMessages(String userID) {
        return offlineMessages.containsKey(userID);
    }

    public static ArrayList<Message> getOfflineMessages(String userID) {
        return offlineMessages.get(userID);
    }
}
