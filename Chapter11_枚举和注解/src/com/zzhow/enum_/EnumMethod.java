package com.zzhow.enum_;

/**
 * 0429_Enum成员方法
 * enum常用的方法应用实例
 * 2024年2月10日
 *
 * @author ZZHow1024
 */
public class EnumMethod {
    public static void main(String[] args) {
        //使用Season03枚举类演示
        Season03 winter = Season03.WINTER;

        //1. 输出枚举对象的名字
        System.out.println(winter.name());

        //2. 输出该枚举对象的次序
        //WINTER枚举对象是第4个，因此输出3
        System.out.println(winter.ordinal());

        //3. 返回Season03[]，含有定义的所有枚举对象
        Season03[] values = Season03.values();
        System.out.println("使用增强for循环遍历取出枚举对象");
        for (Season03 season03 : values) {
            System.out.println(season03);
        }

        //4. 将字符串转换成枚举对象，要求字符串必须为已有的常量名，否则报异常
        //执行流程：
        //①. 根据你输入的"WINTER"到Season03的枚举对象中查找
        //②. 如果找到了就返回，如果没找到就报错
        Season03 winter1 = Season03.valueOf("WINTER");
        System.out.println("winter1 = " + winter1);

        //5. 比较两个枚举常量，比较的就是编号，返回前边的编号减后边的编号
        System.out.println(Season03.SPRING.compareTo(Season03.SUMMER));
    }
}
