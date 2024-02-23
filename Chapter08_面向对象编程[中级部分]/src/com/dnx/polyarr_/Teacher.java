package com.dnx.polyarr_;
//DNX写于2024年1月27日

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String say() {
        return "Teacher  " + super.say() + ", salary:" + salary;
    }

    //特有方法
    public void teach() {
        System.out.println("Teacher  " + getName() + " is in class.");
    }
}

