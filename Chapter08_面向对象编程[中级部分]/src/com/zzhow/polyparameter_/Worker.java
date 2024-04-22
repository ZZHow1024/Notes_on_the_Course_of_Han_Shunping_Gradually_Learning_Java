package com.zzhow.polyparameter_;
//ZZHow写于2024年1月27日

public class Worker extends Employee {
    public Worker() {
    }

    public Worker(String name, double salary) {
        super(name, salary);
    }

    public void work() {
        System.out.println("worker  " + getName() + " is working.");
    }

    @Override
    public double getAnnual() {
        return super.getAnnual();
    }
}
