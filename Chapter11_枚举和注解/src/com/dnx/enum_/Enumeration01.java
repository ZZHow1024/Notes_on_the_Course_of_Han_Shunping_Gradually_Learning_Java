package com.dnx.enum_;

/**
 * 0424_枚举类引出
 * 要求创建季节(Season)对象
 * 2024年2月10日
 *
 * @author DNX
 */

public class Enumeration01 {
    public static void main(String[] args) {
        Season01 spring = new Season01("春天", "温暖");
        Season01 summer = new Season01("夏天", "炎热");
        Season01 autumn = new Season01("秋天", "凉爽");
        Season01 winter = new Season01("冬天", "寒冷");
        autumn.setName("黑天");
        autumn.setDesc("非常的热");
        //对于季节而言，他的对象(具体值)是固定的四个，不会有更多的
        //这个设计类的思路，不能体现季节是固定的四个对象
        Season01 other = new Season01("蓝天", "白云");
        //这样的设计不好，引出枚举类[枚：一个一个，举：举例]
    }
}

class Season01{ //类
    private String name;
    private  String desc; //描述

    public Season01() {
    }

    public Season01(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
