package com.dnx.interface_;
//DNX写于2024年2月5日

public class Computer {
    //编写一个方法，计算机工作
    public void work(UsbInterface usbInterface){
        //通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
