package com.dnx.polymorphic_;
//DNX写于2024年1月26日

public class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

class Pig extends Animal {
    public Pig(String name) {
        super(name);
    }
}