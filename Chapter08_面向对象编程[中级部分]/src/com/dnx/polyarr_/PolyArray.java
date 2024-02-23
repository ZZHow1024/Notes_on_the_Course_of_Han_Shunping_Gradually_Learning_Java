package com.dnx.polyarr_;
//DNX写于2024年1月27日

public class PolyArray {
    public static void main(String[] args) {
        //案例：现有一个继承结构如下，要求创建1个Person对象、2个Student 对象和2个Teacher对象，
        // 统一放在数组中，并调用每个对象say方法。
        Person[] people = new Person[5];
        people[0] = new Person("daming",30);
        people[1] =new Student("Jack",13,100);
        people[2] =new Student("Smith",18,85.5);
        people[3]=new Teacher("Scott",30,20000);
        people[4]=new Teacher("King",50,25000);

        //循环遍历多态数组，调用say方法。
        for (int i = 0; i < people.length; i++) {
            // 编译类型：Person，运行类型：根据实际情况由JVM来判断。
            System.out.println(people[i].say()); // 动态绑定机制
            if (people[i] instanceof Student) {
                ((Student)people[i]).study();
            } else if (people[i] instanceof Teacher) {
                ((Teacher)people[i]).teach();
            }
        }
    }
}
