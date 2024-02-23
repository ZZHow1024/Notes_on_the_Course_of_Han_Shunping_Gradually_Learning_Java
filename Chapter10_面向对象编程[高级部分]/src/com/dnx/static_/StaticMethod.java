package com.dnx.static_;
//DNX写于2024年2月4日

public class StaticMethod {
    public static void main(String[] args) {
        Student tom = new Student("Tom");
        //tom.payFee(100);
        Student.payFee(100);
        Student jack = new Student("Jack");
        //jack.payFee(200);
        Student.payFee(200);

        //输出当前收到的总学费
        Student.shouFee();//300
    }
}

class Student {
    //成员变量
    private String name;
    //定义一个类变量，累积学生的学费
    private static double fee = 0;

    public Student(String name) {
        this.name = name;
    }

    public static void payFee(double fee) {
        Student.fee += fee;
    }

    public static void shouFee() {
        System.out.println("总学费有：" + Student.fee);
    }
}
