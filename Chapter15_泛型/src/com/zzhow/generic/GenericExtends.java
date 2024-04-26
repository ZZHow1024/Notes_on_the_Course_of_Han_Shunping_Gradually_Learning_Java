package com.zzhow.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024年4月26日
 *
 * @author ZZHow
 */
public class GenericExtends {
    public static void main(String[] args) {
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<AA> list3 = new ArrayList<>();
        ArrayList<BB> list4 = new ArrayList<>();
        ArrayList<CC> list5 = new ArrayList<>();

        //<?>：支持任意泛型类型
        printCollection1(list1);
        printCollection1(list2);
        printCollection1(list3);
        printCollection1(list4);
        printCollection1(list5);

        //<? extends A>：支持A类以及A类的子类，规定了泛型的上限
//      printCollection2(list1); //×
//      printCollection2(list2); //×
        printCollection2(list3);
        printCollection2(list4);
        printCollection2(list5);

        //<? super A>：支持A类以及A类的父类，不限于直接父类，规定了泛型的下限
        printCollection3(list1);
//      printCollection3(list2); //×
        printCollection3(list3);
//      printCollection3(list4); //×
//      printCollection3(list5); //×
    }

    public static void printCollection1(List<?> c) {
        for (Object object : c)
            System.out.println(object);
    }

    public static void printCollection2(List<? extends AA> c) {
        for (Object object : c)
            System.out.println(object);
    }

    public static void printCollection3(List<? super AA> c) {
        for (Object object : c)
            System.out.println(object);
    }
}

class AA {

}

class BB extends AA {

}

class CC extends BB {

}
