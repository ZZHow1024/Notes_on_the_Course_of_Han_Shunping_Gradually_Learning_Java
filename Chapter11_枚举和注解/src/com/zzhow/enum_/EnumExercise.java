package com.zzhow.enum_;

/**
 * 0430_Enum课堂练习
 * 2024年2月10日
 *
 * @author ZZHow1024
 */
public class EnumExercise {
    public static void main(String[] args) {
        //获取到所有的枚举对象，即数组
        Week[] values = Week.values();
        //使用增强for循环遍历
        System.out.println("===所有星期的信息如下===");
        for(Week i : values){
            System.out.println(i);
        }
    }
}

//1.声明Week枚举类，其中包含星期一至星期日的定义：
// MONDAY，TUESDAY，WEDNESDAY，
// THURSDAY，FRIDAY，SATURDAY，SUNDAY。
enum Week {
    //定义Week的枚举对象
    MONDAY("星期一"), TUESDAY("星期二"), WEDNESDAY("星期三"),
    THURSDAY("星期四"), FRIDAY("星期五"), SATURDAY("星期六"), SUNDAY("星期日");
    private String name;

    private Week() {
    }

    private  Week(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
