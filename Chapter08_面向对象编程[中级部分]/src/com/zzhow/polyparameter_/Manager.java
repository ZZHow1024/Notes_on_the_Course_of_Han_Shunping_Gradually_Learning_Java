package com.zzhow.polyparameter_;
//ZZHow写于2024年1月27日

public class Manager extends Employee {
    private double bonus;

    public Manager() {
    }

    public Manager(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }

    public void manage() {
        System.out.println("manager  " + getName() + " is managing.");
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public double getAnnual() {
        return super.getAnnual() + bonus;
    }
}
