package com.zzhow.annotation_;

/**
 * 0433_Deprecated注解
 * 2024年2月11日
 *
 * @author ZZHow1024
 */
public class Deprecated_ {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("a.n1 = " + a.n1);
        a.hi();
    }
}

//提示：
//1. @Deprecated 修饰某个元素，表示该元素已经过时
//2. 即不再推荐使用，但是仍然可以使用
//3. 查看 @Deprecated 注解类的源码
//4. 可以修饰 方法、类、字段、包、参数 等等。
//5. @Deprecated 可以做版本升级过度使用
@Deprecated
class A {
    @Deprecated
    public int n1 = 1;

    @Deprecated
    public void hi() {
        System.out.println("hi~");
    }
}
