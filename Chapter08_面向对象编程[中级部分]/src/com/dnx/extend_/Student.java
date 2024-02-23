package com.dnx.extend_;
//DNX写于2024年1月25日

//是Pupil 和 Undergraduate的父类。
public class Student {
    //共有的属性
    public String name;
    public int age;
    public double score;

    //共有的方法
    public void setScore(double score) {
        this.score = score;
    }

    public void showInfo() {
        System.out.println("name:" + name + ", age:" + age + ", score:" + score);
    }

}
