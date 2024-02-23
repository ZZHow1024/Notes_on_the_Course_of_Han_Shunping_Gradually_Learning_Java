package com.dnx.enum_;

/**
 * 0425_自定义枚举类
 * 自定义类实现枚举
 * 2024年2月10日
 *
 * @author DNX
 */
public class Enumeration02 {
    public static void main(String[] args) {
        System.out.println(Season02.SPRING);
        System.out.println(Season02.SUMMER);
        System.out.println(Season02.AUTUMN);
        System.out.println(Season02.WINTER);
    }
}

//演示定义枚举实现：
//1. 将构造器私有化，防止直接new
//2. 去掉setXXX方法，防止属性被修改
//3. 在Season内部，直接创建固定的对象
//4. 优化，可以加入final修饰符
class Season02{ //类
    private String name;
    private  String desc; //描述

    public static final Season02 SPRING = new Season02("春天","温暖");
    public static final Season02 SUMMER = new Season02("夏天","炎热");
    public static final Season02 AUTUMN = new Season02("秋天","凉爽");
    public static final Season02 WINTER = new Season02("冬天","寒冷");

    private Season02() {
    }

    private Season02(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season02{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}