package com.zzhow.string_;

/**
 * 0471-0473_String常用方法
 * 2024年2月25日
 *
 * @author ZZHow
 */
public class StringMethod {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "Hello";
        System.out.println("str1 = " + str1 + ", str2 = " + str2 + "\n");

        //1. equals 区分大小写，判断内容是否相等
        System.out.println("1. equals演示");
        System.out.println("str1.equals(str2) = " + str1.equals(str2) + "\n");

        //2. equalsIgnoreCase 忽略大小写的判断内容是否相等
        System.out.println("2. equalsIgnoreCase演示");
        System.out.println("str1.equalsIgnoreCase(str2) = " + str1.equalsIgnoreCase(str2) + "\n");

        //3. length 获取字符的个数，字符串的长度
        System.out.println("3. length演示");
        System.out.println("str1.length() = " + str1.length() + "\n");

        //4. indexOf 获取字符在字符串中第1次出现的索引，索引从0开始，如果找不到，返回-1
        System.out.println("4. indexOf演示");
        System.out.println("str1.indexOf('l') = " + str1.indexOf('l') + "\n");

        //5. lastIndexOf 获取字符在字符串中最后1次出现的索引，索引l从0开始，如找不到，返回-1
        System.out.println("5. lastIndexOf演示");
        System.out.println("str1.lastIndexOf('l') = " + str1.lastIndexOf('l') + "\n");

        //6. substring 截取指定范围的子串
        System.out.println("6. substring演示");
        System.out.println("str1.substring(0,4) = " + str1.substring(0, 4) + "\n");

        //7. trim 去前后空格
        System.out.println("7. trim演示");
        System.out.println("\"   1 2 3   \".trim() = " + "   1 2 3   ".trim() + "\n");

        //8. charAt 获取某索引处的字符
        System.out.println("8. charAt演示");
        System.out.println("str1.charAt(0) = " + str1.charAt(0) + "\n");

        //9. toUpperCase 转换成大写
        System.out.println("9. toUpperCase演示");
        System.out.println("str1.toUpperCase() = " + str1.toUpperCase() + "\n");

        //10. toLowerCase 转换成小写
        System.out.println("10. toLowerCase演示");
        System.out.println("str2.toLowerCase() = " + str2.toLowerCase() + "\n");

        //11. concat 拼接字符串
        System.out.println("11. concat演示");
        System.out.println("str1.concat(str2) = " + str1.concat(str2) + "\n");

        //12. replace 替换字符串中的字符
        System.out.println("12. replace演示");
        System.out.println("str1.replace('l','a') = " + str1.replace('l', 'a') + "\n");

        //13. split 分割字符串，对于某些分割字符，我们需要转义比如 \\等
        System.out.println("13. split演示");
        String path = "D:\\Program\\Java";
        System.out.println("分割前 " + path);
        String[] split = path.split("\\\\");
        System.out.print("分割后 ");
        for (String i : split)
            System.out.print(i + ' ');
        System.out.println("\n");

        //14. compareTo 比较两个字符串的大小，如果前者大，则返回正数，后者大，则返回负数，如果相等，返回 0。
        System.out.println("14. compareTo演示");
        System.out.println("str1.compareTo(str2) = " + str1.compareTo(str2) + "\n");

        //15. toCharArray 转换成字符数组
        System.out.println("15. toCharArray演示");
        char[] strArr = str1.toCharArray();
        for (char i : strArr)
            System.out.print(i + " ");
        System.out.println("\n");

        //16. format 格式字符串
        System.out.println("16. format演示");
        String name = "ZZHow";
        int age = 18;
        double score = 99.99;
        char gender = '♂';

        String infoFormat =
                "姓名：%s，年龄：%d，成绩%.1f，性别：%c。";
        String info = String.format(infoFormat, name, age, score, gender);
        System.out.println(info + "\n");
    }
}