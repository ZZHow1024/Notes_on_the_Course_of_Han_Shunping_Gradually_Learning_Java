package com.dnx.bignum;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

/**
 * 2024年3月17日
 *
 * @author DNX
 */
public class BigDecimal_ {
    public static void main(String[] args) {
        //案例：BigDecimal 类演示
        BigDecimal bigDecimal1 = new BigDecimal("1.12345678901234567890123");
        BigDecimal bigDecimal2 = new BigDecimal("0.123");
        System.out.println("bigDecimal1 = " + bigDecimal1);
        System.out.println("bigDecimal2 = " + bigDecimal2);
        System.out.println();
        //在对 BigDecimal 进行四则运算时需要使用对应的方法，不能直接进行 + - * /

        System.out.println("1. BigDecimal 加法演示");
        System.out.println("bigDecimal1.add(bigDecimal2) = " + bigDecimal1.add(bigDecimal2) + "\n");

        System.out.println("2. BigDecimal 减法演示");
        System.out.println("bigDecimal1.subtract(bigDecimal2) = " + bigDecimal1.subtract(bigDecimal2) + "\n");

        System.out.println("3. BigDecimal 乘法演示");
        System.out.println("bigDecimal1.multiply(bigDecimal2) = " + bigDecimal1.multiply(bigDecimal2) + "\n");

        System.out.println("4. BigDecimal 除法演示");
        System.out.println("bigDecimal1.divide(bigDecimal2) = " + bigDecimal1.divide(bigDecimal2, bigDecimal1.scale(), RoundingMode.HALF_UP) + "\n");
        // 可能抛出 ArithmeticException 异常(在除不尽的时候出现)
        // 需要指定精度
        // 保持和被除数精度一样：BigDecimal.ROUND_CEILING(已过时)
        // 可以使用 bigDecimal1.scale() 配合四舍五入模式：RoundingMode.HALF_UP、RoundingMode.CEILING、RoundingMode.FLOOR
    }
}
