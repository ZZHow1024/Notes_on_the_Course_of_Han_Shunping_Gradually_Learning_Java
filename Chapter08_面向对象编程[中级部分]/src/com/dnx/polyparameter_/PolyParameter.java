package com.dnx.polyparameter_;
//DNX写于2024年1月27日

public class PolyParameter {
    public static void main(String[] args) {
        Worker tom = new Worker("Tom", 13000);
        Manager jack = new Manager("Jack", 20000, 3000);
        PolyParameter polyParameter = new PolyParameter();
        polyParameter.testWork(tom);
        polyParameter.showEmpAnnual(tom);
        polyParameter.testWork(jack);
        polyParameter.showEmpAnnual(jack);

    }

    //实现获取任何员工对象的年工资，并在main方法中调用该方法。
    //[e.getAnnual()]
    public void showEmpAnnual(Employee e) {
        System.out.println("Annual salary:" + e.getAnnual());
    }

    public void testWork(Employee e) {
        if (e instanceof Worker) {
            ((Worker) e).work(); // 向下转型
        } else if (e instanceof Manager) {
            ((Manager) e).manage(); // 向下转型
        } else {
            System.out.println("不做处理。");
        }
    }
}
