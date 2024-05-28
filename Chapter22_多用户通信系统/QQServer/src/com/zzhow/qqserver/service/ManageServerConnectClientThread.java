package com.zzhow.qqserver.service;

import java.util.HashMap;
import java.util.Iterator;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 2.0
 * 管理服务器端连接客户端的线程
 */
public class ManageServerConnectClientThread {
    //key -> userID | value -> Thread
    private static HashMap<String, ServerConnectClientThread> hashMap = new HashMap<>();

    //添加线程
    public static void addServerConnectClientThread(String userID, ServerConnectClientThread serverConnectClientThread) {
        hashMap.put(userID, serverConnectClientThread);
    }

    //移除线程
    public static void removeServerConnectClientThread(String userID) {
        hashMap.remove(userID);
    }

    //获取线程
    public static ServerConnectClientThread getServerConnectClientThread(String userID) {
        return hashMap.get(userID);
    }

    //确认用户是否在线
    public static boolean isOnline(String userID) {
        return hashMap.containsKey(userID);
    }

    //获取在线用户列表(用,分割)
    public static String getOnlineUsersList() {
        StringBuilder onlineUsersList = new StringBuilder();

        Iterator<String> iterator = hashMap.keySet().iterator();
        while (true) {
            onlineUsersList.append(iterator.next());
            if (iterator.hasNext())
                onlineUsersList.append(",");
            else
                break;
        }

        return onlineUsersList.toString();
    }
}
