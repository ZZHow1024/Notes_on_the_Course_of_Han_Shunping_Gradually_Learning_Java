package com.dnx.polymorphic_;
//DNX写于2024年1月26日

public class Poly {
    public static void main(String[] args) {
        Master master = new Master("DNX");
        Dog dog = new Dog("Doge");
        Bone bone = new Bone("肉骨头");
        master.feed(dog, bone);

        Cat cat = new Cat("Tom");
        Fish fish = new Fish("小黄鱼");
        master.feed(cat, fish);
    }
}
