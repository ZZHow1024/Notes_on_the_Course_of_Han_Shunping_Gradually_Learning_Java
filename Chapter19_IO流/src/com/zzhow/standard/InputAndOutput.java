package com.zzhow.standard;

/**
 * 2024/5/17
 *
 * @author ZZHow
 * 案例：标准输入输出流
 */
public class InputAndOutput {
    public static void main(String[] args) {
        //System 类的 public static final InputStream in = null;

        //System.in 的编译类型为 InputStream
        //System.in 的运行类型为 BufferedInputStream
        //表示标准输入 键盘
        System.out.println(System.in.getClass());

        //System 类的 public static final PrintStream out = null;

        //System.out 的编译类型为 PrintStream
        //System.out 的运行类型为 PrintStream
        //表示标准输出 显示器
        System.out.println(System.out.getClass());
        System.out.println("Hello World");
    }
}
