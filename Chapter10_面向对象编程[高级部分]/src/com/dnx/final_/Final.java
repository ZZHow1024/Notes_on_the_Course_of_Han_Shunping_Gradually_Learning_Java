package com.dnx.final_;
//DNX写于2024年2月5日

public class Final {
    public static void main(String[] args) {
        E e = new E();
        //e.TAX_RATE = 0.09;
    }
}

//当不希望类被继承时
final class A {

}

//class B extends A{}

class C {
    //当不希望父类的某个方法
    //被子类覆盖/重写(override)时
    public final void hi() {
    }
}

class D extends C {
//    public void hi(){
//        System.out.println("重写了hi()方法");
//    }
}

class E {
    //当不希望类的的某个属性的值被修改时
    public final double TAX_RATE = 0.1;

    public void say() {
        //当不希望某个局部变量被修改时
        //这时，NUM也被称为局部常量
        final double NUM = 1.23;
        //NUM = 1.11;
    }
}
