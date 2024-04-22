package com.zzhow.interface_;
//ZZHow写于2024年2月5日

public class Phone implements UsbInterface {
    //Phone类实现UsbInterface

    @Override
    public void start() {
        System.out.println("手机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作");
    }
}
