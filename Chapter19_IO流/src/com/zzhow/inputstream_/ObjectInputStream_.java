package com.zzhow.inputstream_;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * 2024/5/16
 *
 * @author ZZHow
 * 案例：使用 ObjectInputStream 读取 data.dat 并反序列化恢复数据
 */
public class ObjectInputStream_ {
    public static void main(String[] args) {
        String filePath = "D:\\data.dat";

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filePath))) {
            //读取（反序列化）的顺序需要和保存（序列化）的顺序一致
            System.out.println(ois.readInt());
            System.out.println(ois.readBoolean());
            System.out.println(ois.readChar());
            System.out.println(ois.readDouble());
            System.out.println(ois.readFloat());
            System.out.println(ois.readUTF());
            Object dog = ois.readObject();
            System.out.println("运行类型为：" + dog.getClass().getName());
            System.out.println("dog = " + dog);
        } catch (IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
