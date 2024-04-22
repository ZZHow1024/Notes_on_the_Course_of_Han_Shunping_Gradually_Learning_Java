package com.zzhow.abstract_;
//ZZHow写于2024年2月5日

public class BB extends Template {

    public BB() {
        super("BB");
    }

    @Override
    public void job() {
        //计算任务：1 * ... * 800000
        long num = 1;
        for (int i = 1; i <= 800000; i++) {
            num *= i;
        }
    }
}
