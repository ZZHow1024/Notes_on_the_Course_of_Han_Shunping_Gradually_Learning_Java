package com.dnx.map_;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 2024年4月17日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class MapExercise {
    public static void main(String[] args) {
        /*
        - 案例：使用HashMap添加3个员工对象
            - 要求：
                - 键：员工 id
                - 值：员工对象
                - 遍历显示工资 >18000 的员工（遍历方式最少两种）
                    员工类：姓名、工资、员工 id
         */
        Map hashMap = new HashMap();

        //添加对象：
        hashMap.put(1, new Employee("Tom", 1000, 1));
        hashMap.put(2, new Employee("Bob", 20000, 2));
        hashMap.put(3, new Employee("Jack", 39999, 3));

        System.out.println("所有员工：");
        System.out.println(hashMap + "\n");

        //遍历：
        //1. 使用 KeySet + 迭代器
        System.out.println("使用 KeySet + 迭代器 遍历工资 >18000 的员工");
        Set keySet = hashMap.keySet();
        Iterator iterator = keySet.iterator();
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Employee employee = (Employee) hashMap.get(key);
            if (employee.getSalary() > 18000)
                System.out.println(employee);
        }
        System.out.println();

        //2. 使用 EntrySet + 增强 for
        System.out.println("使用 EntrySet + 增强 for 遍历工资 >18000 的员工");
        Set entrySet = hashMap.entrySet();
        for (Object obj : entrySet) {
            Map.Entry entry = (Map.Entry) obj;
            Employee employee = (Employee) entry.getValue();
            if (employee.getSalary() > 18000)
                System.out.println(employee);
        }
    }
}

class Employee {
    private String name;
    private double salary;
    private int id;

    public Employee() {
    }

    public Employee(String name, double salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", id=" + id +
                '}';
    }
}
