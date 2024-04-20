package com.zzhow.enum_;

/**
 * 0426-0428_enum枚举类
 * 使用enum来实现前面的枚举案例
 * 2024年2月10日
 *
 * @author ZZHow1024
 */
public class Enumeration03 {
    public static void main(String[] args) {
        System.out.println(Season03.SPRING);
        System.out.println(Season03.SUMMER);
        System.out.println(Season03.AUTUMN);
        System.out.println(Season03.WINTER);
    }
}

//演示使用enum关键字来实现枚举类
//1. 使用enum关键字替代class
//2. public static final Season03 SPRING = new Season03("春天","温暖"); 直接使用
// SPRING("春天","温暖");
//3. 如果有多个常量(对象)，使用逗号间隔即可
enum Season03 {
    SPRING("春天","温暖"),SUMMER("夏天","炎热"),
    AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷");
    private String name;
    private String desc;


    Season03() {
    }

    Season03(String name, String desc) {
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
        return "Season03{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
