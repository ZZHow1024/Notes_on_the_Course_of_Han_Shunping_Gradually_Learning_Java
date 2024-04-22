package com.zzhow.polyarr_;
//ZZHow写于2024年1月27日

public class Student extends Person {
    public double score;

    public Student() {
    }

    public Student(String name, int age, double score) {
        super(name, age);
        this.score = score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public double getScore() {
        return score;
    }

    //重写父类say方法
    @Override
    public String say() {
        return "Student  " + super.say() + ", score:" + score;
    }

    //特有方法
    public void study() {
        System.out.println("Student  " + getName() + " is learning Java.");
    }
}
