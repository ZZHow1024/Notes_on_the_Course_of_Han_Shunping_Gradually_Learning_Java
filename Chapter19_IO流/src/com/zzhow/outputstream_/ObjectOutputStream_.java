package com.zzhow.outputstream_;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 * 2024/5/16
 *
 * @author ZZHow
 * 案例：使用 ObjectOutputStream 序列化基本数据类型和一个 Dog 对象(name, age)，并保存到 data.dat 文件中
 */
public class ObjectOutputStream_ {
    public static void main(String[] args) {
        //序列化后是一种特别的格式，并不是正常的文本格式
        String filePath = "D:\\data.dat"; //后缀名可以自己起

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filePath))) {
            oos.writeInt(123); //int -> Integer(实现了 Serializable)
            oos.writeBoolean(true); //boolean -> Boolean(实现了 Serializable)
            oos.writeChar('a'); //char -> Character(实现了 Serializable)
            oos.writeDouble(1.23); //double -> Double(实现了 Serializable)
            oos.writeFloat(3.14f); //float -> Float(实现了 Serializable)
            oos.writeUTF("Hello World"); //String(实现了 Serializable)
            oos.writeObject(new Dog("Spike", 3)); //保存一个 Dog 的对象

            System.out.println("数据保存成功(序列化形式)");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Dog implements Serializable {
    private String name;
    private int age;

    public Dog() {
    }

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "name = " + this.name + ", age = " + this.age;
    }
}
