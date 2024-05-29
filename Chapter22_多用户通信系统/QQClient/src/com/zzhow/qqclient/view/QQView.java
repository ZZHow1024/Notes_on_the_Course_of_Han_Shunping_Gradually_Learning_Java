package com.zzhow.qqclient.view;

import com.zzhow.qqclient.service.FileClientServer;
import com.zzhow.qqclient.service.MessageClientService;
import com.zzhow.qqclient.service.UserClientService;
import com.zzhow.qqclient.utils.Utility;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @Version 3.1
 * 客户端界面
 */
public class QQView {
    private boolean loop = true;
    private String userID;
    private final UserClientService userClientService = new UserClientService(); //用于用户登录注册的对象
    private final MessageClientService messageClientService = new MessageClientService(); //用于私聊和群聊的对象
    private final FileClientServer fileClientServer = new FileClientServer(); //用于文件传输

    //显示主菜单
    public void mainMenu() {
        while (loop) {
            System.out.println("===网络通讯系统（客户端）===");
            System.out.println("\t\t1 登录");
            System.out.println("\t\t9 退出");

            System.out.print("请输入选项：");
            String key = Utility.readString(1);
            //根据用户输入，来处理不同逻辑
            switch (key) {
                case "1" -> {
                    System.out.println("--登录--");
                    System.out.print("请输入用户 ID：");
                    userID = Utility.readString(50);
                    System.out.print("请输入密码：");
                    String password = Utility.readString(50);

                    if (userClientService.checkUser(userID, password)) {
                        System.out.println("===欢迎" + this.userID + "===");
                        secondaryMenu();
                    } else {
                        System.out.println("登录失败");
                    }
                }
                case "9" -> {
                    System.out.println("客户端已退出");
                    loop = false;
                }
                default -> System.out.println("无此选项");
            }
        }
    }

    private void secondaryMenu() {
        while (loop) {
            System.out.println("===网络通信系统二级菜单(用户 " + this.userID + ")");
            System.out.println("\t\t1 显示在线用户列表");
            System.out.println("\t\t2 群发消息");
            System.out.println("\t\t3 私聊消息");
            System.out.println("\t\t4 发送文件");
            System.out.println("\t\t9 退出系统");

            System.out.print("请输入选项：");
            String key = Utility.readString(1);
            switch (key) {
                case "1" -> {
                    userClientService.onlineFriend();
                }
                case "2" -> {
                    System.out.println("---群发消息---");
                    System.out.print("请输入要发送的消息：");
                    String content = Utility.readString(500);
                    messageClientService.sendMessageToAll(userID, content);
                }
                case "3" -> {
                    System.out.println("---私聊消息---");
                    System.out.print("请输入想要私聊的用户名（在线）：");
                    String receiver = Utility.readString(50);
                    System.out.print("请输入要发送的消息：");
                    String content = Utility.readString(500);
                    messageClientService.sendMessageToOne(userID, receiver, content);
                }
                case "4" -> {
                    System.out.print("请输入想要发送文件的用户名（在线）：");
                    String receiver = Utility.readString(50);
                    System.out.print("请输入要发送的文件路径：");
                    String src = Utility.readString(500);
                    System.out.print("请输入要对方保存的文件路径：");
                    String dest = Utility.readString(500);
                    fileClientServer.sendFileToOne(src, dest, userID, receiver);
                }
                case "9" -> {
                    userClientService.logout();
                }
                case null, default -> System.out.println("无此选项");
            }
        }
    }
}
