package com.dnx.collection_;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 2024年3月27日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class CollectionIterator {
    public static void main(String[] args) {
        //案例：Iterator 迭代器演示
        Collection list = new ArrayList();

        list.add(new Book("Discrete mathematics", "Jack", 50.00));
        list.add(new Book("Linear algebra", "Tom", 60.50));
        list.add(new Book("Data structure", "Jerry", 12.35));

        System.out.println("list = " + list + "\n");

        //遍历步骤：
        //1. 得到 list 对应的迭代器
        Iterator iterator = list.iterator();

        //2. 使用 while 循环遍历
        while (iterator.hasNext()) {//判断是否还有数据
            //返回下一个元素，类型为 Object
            Object next = iterator.next();
            System.out.println("next = " + next);
        }
        //迭代器模板快捷键 ---> itit
        //显示所有快捷键 ---> Ctrl + J

        //3. 当退出 while 循环后，这时 iterator 迭代器指向最后的元素
        //  如果继续 iterator.next(); 会抛出 NoSuchElementException 异常

        //4. 如果希望再次遍历，需要重置迭代器
        iterator = list.iterator(); //重置迭代器
        System.out.println("===第二次遍历===");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println("next = " + next);
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
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                '}';
    }
}
