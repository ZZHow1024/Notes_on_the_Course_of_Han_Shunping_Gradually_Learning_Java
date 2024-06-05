package com.zzhow.class_;

/**
 * @author ZZHow
 * @date 2024/6/4
 */
public class Car {
    public String brand = "Car"; //品牌
    public int price = 1000; //价格
    public String color = "White"; //颜色

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
