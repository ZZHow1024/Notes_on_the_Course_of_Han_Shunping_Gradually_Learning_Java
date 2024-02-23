package com.dnx.string_;

/**
 * 0465_String结构剖析
 * 2024年2月21日
 *
 * @author DNX
 */
public class String_ {
    public static void main(String[] args){
        //1. String 对象用于保存字符串，也就是一组字符序列。
        //2. "Jack" 字符串常量，双引号括起的字符序列。
        //3. 字符串的字符使用Unicode字符编码，一个字符（不区分字母还是汉字）占两个字节。
        //4. String 类有很多构造器，构造器的重载。
        //  常用的有
        /*  String s1 = new String();
            String s2 = new String(String original);
            String s3 = new String(char[] a);
            String s4 = new String(char[] a, int startIndex, int count);
        */
        //5. String 类实现了接口Serializable[String 可以串行化：可以在网络传输]
        //                接口Comparable[String对象可以比较大小]
        //6. String 是final 类，不能被其他的类继承。
        //7. String 有属性 private final char value[]；用于存放字符串内容。
        //8. 一定要注意：value是一个final类型，不可以修改：即vaLue不能指向新的地址，
        // 但是单个字符内容是可以变化。
        String name = "Jack";
        name = "Tom";
        final char[] value ={'a','b','c'};
        char[] newValue = {'i','j','k'};
        value[0] = 'A'; //√
        //value = newValue; //× 不能修改 value 指向的地址
    }
}
