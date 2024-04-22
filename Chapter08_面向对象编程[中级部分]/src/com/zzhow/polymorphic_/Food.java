package com.zzhow.polymorphic_;
//ZZHow写于2024年1月26日

public class Food {
    private String name;

    public Food(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Bone extends Food{
    public Bone(String name){
        super(name);
    }
}

class Fish extends Food{
    public Fish(String name){
        super(name);
    }
}

class Rice extends Food{
    public Rice(String name){
        super(name);
    }
}