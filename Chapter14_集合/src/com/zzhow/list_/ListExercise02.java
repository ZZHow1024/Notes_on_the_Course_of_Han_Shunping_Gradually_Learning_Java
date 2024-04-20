package com.zzhow.list_;

import java.util.ArrayList;
import java.util.List;

/**
 * 2024年4月2日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class ListExercise02 {
    public static void main(String[] args) {
        List list = new ArrayList();
//        Vector list = new ArrayList();
//        LinkedList list = new ArrayList();
        list.add(new Book("Discrete mathematics", "Jack", 50.00));
        list.add(new Book("Linear algebra", "Tom", 60.50));
        list.add(new Book("Data structure", "Jerry", 12.35));

        //遍历：
        for (Object o : list) {
            System.out.println(o);
        }
        System.out.println();

        //调用自己写的冒泡排序方法：
        sort(list);

        System.out.println("===按照价格排序后===");
        for (Object o : list) {
            System.out.println(o);
        }
    }

    public static void sort(List list) {
        //冒泡排序
        int listSize = list.size();
        for (int i = 0; i < listSize - 1; i++)
            for (int j = 0; j < listSize - 1 - i; j++) {
                //取出对象
                Book book1 = (Book) list.get(j);
                Book book2 = (Book) list.get(j + 1);
                if (book1.getPrice() > book2.getPrice()) {
                    //交换
                    list.set(j, book2);
                    list.set(j + 1, book1);
                }
            }
    }
}

class Book {
    private String name;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String name, String author, double price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "名称：" + name + "\t\t价格：" + price + "\t\t价格：" + price;
    }
}
