package com.zzhow.qqcommon;

import java.io.Serial;
import java.io.Serializable;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @version 1.0
 * 消息对象
 */
public class Message implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private String sender; //发送者
    private String receiver; //接收者
    private String content; //消息内容
    private String sendTime; //发送时间
    private String messageType; //消息类型[在接口中定义消息类型]

    public Message() {
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
}
