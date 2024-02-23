package com.dnx.abstract_;
//DNX写于2024年2月5日

public class AA extends Template {

    public AA() {
        super("AA");
    }

    @Override
    public void job() {
        //计算任务：1 + ... + 1000000
        long num = 0;
        for (int i = 1; i <= 1000000; i++) {
            num += i;
        }
    }
}
