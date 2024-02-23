package com.dnx.interface_;
//DNX写于2024年2月5日

public class Interface {
    public static void main(String[] args) {
        //创建手机、相机对象
        Phone phone = new Phone();
        Camera camera = new Camera();
        //创建计算机
        Computer computer = new Computer();
        computer.work(phone);
        System.out.println("----------");
        computer.work(camera);
    }
}
