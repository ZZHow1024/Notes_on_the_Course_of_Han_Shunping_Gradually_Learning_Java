package com.dnx.annotation_;

/**
 * 0432_Override注解
 * 2024年2月11日
 *
 * @author DNX
 */
public class Override_ {
    public static void main(String[] args) {
        Son son = new Son();
        son.fly();
    }
}

class Father { //父类
    public void fly() {
        System.out.println("Father fly.");
    }
}

class Son extends Father { //子类
    //提示：
    //1. @Override 注解放在fly方法上，表示子类的fly方法时重写了父类的fly方法
    //2. 这里如果没有写 @Override 还是重写了父类的fly方法
    //3. 如果写了Override注解，编译器就会去检查该方法是否真的重写了父类的方法，
    // 如果的确重写了则编译通过，如果没有构成重写则编译错误
    @Override
    public void fly() {
        System.out.println("Son fly.");
    }
}
