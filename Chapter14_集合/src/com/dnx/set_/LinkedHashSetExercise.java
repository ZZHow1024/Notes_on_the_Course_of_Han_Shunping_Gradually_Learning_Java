package com.dnx.set_;

import java.util.LinkedHashSet;
import java.util.Objects;

/**
 * 2024年4月11日
 *
 * @author DNX
 */
@SuppressWarnings("all")
public class LinkedHashSetExercise {
    public static void main(String[] args) {
        /*
        案例：
        - LinkedHashSet 课堂练习
            - Car 类(属性：name, price)，
            如果 name 和 price 一样，则认为是相同元素，就不能添加。
         */
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(new Car("ACar", 19999));
        linkedHashSet.add(new Car("BCar", 29999));
        linkedHashSet.add(new Car("ACar", 19999));
        linkedHashSet.add(new Car("CCar", 19999));
        linkedHashSet.add(new Car("BCar", 29999));

        System.out.println("linkedHashSet = " + linkedHashSet);
    }
}

class Car {
    private String name;
    private double price;

    public Car() {
    }

    public Car(String name, double price) {
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
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(price, car.price) == 0 && Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }
}
