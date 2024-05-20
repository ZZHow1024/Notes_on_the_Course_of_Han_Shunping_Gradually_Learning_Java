package com.zzhow.api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 2024/5/19
 *
 * @author ZZHow
 */
public class API_ {
    public static void main(String[] args) {
        //1. 获取本机 InetAddress 对象 getLocalHost
        InetAddress localHost = null;
        try {
            localHost = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(localHost);

        //2. 根据指定主机名/域名获取 IP 地址对象 getByName
        InetAddress host1 = null;
        try {
            host1 = InetAddress.getByName(localHost.getHostName());
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(host1);

        //3. 根据域名返回 InetAddress 对象，比如 www.baidu.com 相应
        InetAddress host2 = null;
        try {
            host2 = InetAddress.getByName("www.baidu.com");
        } catch (UnknownHostException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("allByName : " + host2);

        //4. 获取 lnetAddress 对象的主机名 getHostName
        System.out.println("host2 的主机名 = " + host2.getHostName());

        //5. 获取 lnetAddress 对象的地址 getHostAddress
        System.out.println("host2 的 IP 地址 = " + host2.getHostAddress());
    }
}
