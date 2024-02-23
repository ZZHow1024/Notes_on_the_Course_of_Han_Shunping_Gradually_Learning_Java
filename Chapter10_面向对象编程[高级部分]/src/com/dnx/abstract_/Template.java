package com.dnx.abstract_;
//DNX写于2024年2月5日

//抽象类-模板设计模式
public abstract class Template {
    private final String jobName;

    public Template(String name) {
        this.jobName = name;
    }

    public abstract void job();

    public void calculateTime() {
        //得到开始的时间
        long startTime = System.currentTimeMillis();
        job();
        //得到结束的时间
        long endTime = System.currentTimeMillis();
        System.out.println(jobName + "任务执行时间" + (endTime - startTime) + "毫秒");
    }
}
