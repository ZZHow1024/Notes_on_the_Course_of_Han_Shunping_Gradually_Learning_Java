package com.zzhow.abstract_;
//ZZHow写于2024年2月5日

public class Abstract {

}

abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    /*
    这里的eat实现了没有什么意义
    父类方法不确定性的问题
        考虑将该方法设计为抽象(abstract)方法
        所谓抽象方法就是没有实现的方法
        所谓没有实现就是指没有方法体
        当一个类中存在抽象方法时，需要将该类声明为abstract类
     */
    public abstract void eat();
}
