package com.zzhow.generic;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * 2024年4月26日
 *
 * @author ZZHow
 */
public class GenericExercise2 {
    public static void main(String[] args) {
        /*
        - 案例：
            - 定义 Employee 类
                1. 该类包含：private 成员变量 name, sal, birthday，
                    其中 birthday 为 MyDate 类的对象
                2. 为每一个属性定义 getter, setter 方法
                3. 重写 toString 方法输出 name, sal, birthday
                4. MyDate 类包含：private 成员变量 month, day, year；
                    并为每一个属性定义 getter, setter 方法
                5. 创建该类的3个对象，并把这些对象放入 ArrayList 集合中（ArrayList 需使用泛型来定义），
                    对集合中的元素进行排序，并遍历输出

            - 排序方式：调用 ArrayList 的 sort 方法，传入 Comparator 对象[使用泛型]，
                先按照 name 排序，如果 name 相同，则按生日日期的先后排序[定制排序]。
         */

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Tom", 30000, new MyDate(2000, 6, 1)));
        employees.add(new Employee("Jerry", 10000, new MyDate(2000, 1, 1)));
        employees.add(new Employee("Tom", 20000, new MyDate(2001, 3, 1)));
        employees.add(new Employee("Tom", 20000, new MyDate(2001, 5, 9)));
        employees.add(new Employee("Tom", 20000, new MyDate(2001, 5, 3)));

        System.out.println("排序前：");
        System.out.println(employees + "\n");

        employees.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                if (o1 == null || o2 == null)
                    return 0;

                int i = o1.getName().compareTo(o2.getName());
                if (i != 0)
                    return i;

                //如果 name 相同，就比较 birthday
                return o1.getBirthday().compareTo(o2.getBirthday());
            }
        });

        System.out.println("排序后：");
        System.out.println(employees);
    }
}

class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

    @Override
    public int compareTo(MyDate o) {
        //比较 birthday - year
        int yearMinus = this.getYear() - o.getYear();
        if (yearMinus != 0)
            return yearMinus;

        //如果 birthday - year 相同，就比较 birthday - month
        int monthMinus = this.getMonth() - o.getMonth();
        if (monthMinus != 0)
            return monthMinus;

        //如果 birthday - month 相同，就比较 birthday - day
        return this.getDay() - o.getDay();
    }
}

class Employee {
    private String name;
    private int salary;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int salary, MyDate birthday) {
        this.name = name;
        this.salary = salary;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", birthday=" + birthday +
                "}\n";
    }
}
