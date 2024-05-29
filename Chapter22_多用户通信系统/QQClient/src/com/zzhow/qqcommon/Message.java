package com.zzhow.qqcommon;

import java.io.Serial;
import java.io.Serializable;

/**
 * 2024/5/27
 *
 * @author ZZHow
 * @version 2.0
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

    //文件消息相关属性
    private String fileName; //文件名
    private byte[] file; //文件内容
    private int fileLength = 0; //文件大小
    private String dest; //文件接收路径


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

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getFile() {
        return file;
    }

    public void setFile(byte[] file) {
        this.file = file;
    }

    public int getFileLength() {
        return fileLength;
    }

    public void setFileLength(int fileLength) {
        this.fileLength = fileLength;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }
}
