package com.zzhow.array_;

import java.util.Arrays;
import java.util.Comparator;

/**
 * 2024年3月13日
 *
 * @author ZZHow
 */
public class ArrayExercise {
    public static void main(String[] args) {
        /*
         *案例：自定义 Book 类，里面包含 name 和 price，使用定制排序实现。
         *（1）按 price 从大到小排序。
         *（2）按 price 从小到大排序。
         *（3）按 name 长度从大到小排序。
         */
        Book[] books1 = new Book[4];
        books1[0] = new Book("这就是ChatGPT", 29.90);
        books1[1] = new Book("大话数据结构", 59.50);
        books1[2] = new Book("计算机底层的秘密", 64.90);
        books1[3] = new Book("信息学奥赛一本通关", 64.00);
        Book[] books2 = Arrays.copyOf(books1, books1.length);
        Book[] books3 = Arrays.copyOf(books1, books1.length);

        //（1）按 price 从大到小排序。
        Arrays.sort(books1, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 对 Book 数组排序，因此 o1 和 o2 就是 Book 对象。
                Book book1 = (Book)o1; //(向下转型)
                Book book2 = (Book)o2; //(向下转型)
                double priceVal = book2.getPrice() - book1.getPrice();
                if(priceVal > 0)
                    return 1;
                else if(priceVal < 0)
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println("===（1）按 price 从大到小排序===");
        System.out.println(Arrays.toString(books1));
        System.out.println();

        //（2）按 price 从小到大排序。
        Arrays.sort(books2, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 对 Book 数组排序，因此 o1 和 o2 就是 Book 对象。
                Book book1 = (Book)o1; //(向下转型)
                Book book2 = (Book)o2; //(向下转型)
                double priceVal = book1.getPrice() - book2.getPrice();
                if(priceVal > 0)
                    return 1;
                else if(priceVal < 0)
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println("===（2）按 price 从小到大排序===");
        System.out.println(Arrays.toString(books2));
        System.out.println();

        //（3）按 name 长度从大到小排序。
        Arrays.sort(books3, new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                // 对 Book 数组排序，因此 o1 和 o2 就是 Book 对象。
                Book book1 = (Book)o1; //(向下转型)
                Book book2 = (Book)o2; //(向下转型)
                double priceVal = book2.getName().length() - book1.getName().length();
                if(priceVal > 0)
                    return 1;
                else if(priceVal < 0)
                    return -1;
                else
                    return 0;
            }
        });
        System.out.println("===（3）按 name 长度从大到小排序===");
        System.out.println(Arrays.toString(books3));
    }
}

class Book{
    private String name;
    private double price;

    public Book() {
    }

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
