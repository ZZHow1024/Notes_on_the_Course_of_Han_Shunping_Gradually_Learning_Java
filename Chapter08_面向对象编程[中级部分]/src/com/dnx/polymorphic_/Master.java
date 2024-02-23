package com.dnx.polymorphic_;
//DNX写于2024年1月26日

public class Master {
    private String name;

    public Master(String name) {
        this.name = name;
    }

    public void feed(Animal animal, Food food) {
        System.out.println("主人 "+name+" 给 "+animal.getName()+" 喂了 "+food.getName());
    }
}