package com.zzhow.qqcommon;

/**
 * 2024/5/28
 *
 * @author ZZHow
 * @version 2.0
 * 消息类型
 */
public interface MessageType {
    String MESSAGE_LOGIN_SUCCEEDED = "1"; //登录成功消息
    String MESSAGE_LOGIN_FAILED = "2"; //登录失败消息
    String MESSAGE_COMMON = "3"; //普通信息包
    String MESSAGE_GET_FRIEND = "4"; //客户端请求返回在线用户列表
    String MESSAGE_RES_FRIEND = "5"; //服务器端返回在线用户列表
    String MESSAGE_CLIENT_LOGOUT = "6"; //客户端请求登出
}
