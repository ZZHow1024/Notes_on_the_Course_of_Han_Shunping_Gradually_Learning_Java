package com.zzhow.bignum;

import java.math.BigInteger;

/**
 * 2024年3月17日
 *
 * @author ZZHow
 */
public class BigInteger_ {
    public static void main(String[] args) {
        //案例：BigInteger 类演示
        BigInteger bigInteger1 = new BigInteger("12345678901234567890123");
        BigInteger bigInteger2 = new BigInteger("123");
        System.out.println("bigInteger1 = " + bigInteger1);
        System.out.println("bigInteger2 = " + bigInteger2);
        System.out.println();
        //在对 BigInteger 进行四则运算时需要使用对应的方法，不能直接进行 + - * /

        System.out.println("1. BigInteger 加法演示");
        System.out.println("bigInteger1.add(bigInteger2) = " + bigInteger1.add(bigInteger2) + "\n");

        System.out.println("2. BigInteger 减法演示");
        System.out.println("bigInteger1.subtract(bigInteger2) = " + bigInteger1.subtract(bigInteger2) + "\n");

        System.out.println("3. BigInteger 乘法演示");
        System.out.println("bigInteger1.multiply(bigInteger2) = " + bigInteger1.multiply(bigInteger2) + "\n");

        System.out.println("4. BigInteger 除法演示");
        System.out.println("bigInteger1.divide(bigInteger2) = " + bigInteger1.divide(bigInteger2) + "\n");
    }
}
