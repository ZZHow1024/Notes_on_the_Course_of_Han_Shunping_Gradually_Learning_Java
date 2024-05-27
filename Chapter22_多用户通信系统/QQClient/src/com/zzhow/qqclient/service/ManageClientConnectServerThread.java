package com.zzhow.qqclient.service;

import java.util.HashMap;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 1.0
 * 管理客户端连接服务器端的线程
 */
public class ManageClientConnectServerThread {
    //key -> userID | value -> Thread
    private static HashMap<String, ClientConnectServerThread> hashMap = new HashMap<>();

    //添加线程
    public static void addClientConnectServerThread(String userID, ClientConnectServerThread clientConnectServerThread) {
        hashMap.put(userID, clientConnectServerThread);
    }

    //获取线程
    public static ClientConnectServerThread getClientConnectServerThread(String userID) {
        return hashMap.get(userID);
    }
}
