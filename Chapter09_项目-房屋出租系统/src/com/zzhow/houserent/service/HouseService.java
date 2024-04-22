package com.zzhow.houserent.service;

import com.zzhow.houserent.domain.House;

/**
 * @author ZZHow
 * 2024年2月3日
 */

public class HouseService {

    private House[] houses; // 保存House对象。
    private int houseNums = 1; // 记录当前有多少个房屋信息
    private int idCounter = 1; // 记录当前的id增长到哪个值

    public HouseService(int size) {
        //new houses
        houses = new House[size]; // 当创建HouseService对象，指定数组大小。
        //为了配合测试列表信息，这里初始化一个House对象。
        houses[0] = new House(1, "Jack", "123", "海淀区", 3000, "已出租");
    }

    //list方法，返回houses
    public House[] list() {
        return houses;
    }

    //add方法，添加新对象，返回boolean
    public boolean add(House newHouse) {
        //判断是否还可以继续添加(暂时不考虑数组扩容的问题)
        if (houseNums == houses.length) {
            System.out.println("数组已满，不能再添加。");
            return false;
        } else {
            //把newHouse对象加入到
            houses[houseNums++] = newHouse;
            //需要设计一个id自增长的机制，然后更新newHouse的id
            newHouse.setId(++idCounter);
            return true;
        }
    }

    //del方法，删除一个房屋信息
    public boolean del(int delId) {
        //应当找到要删除的房屋信息对应的下标
        int index = -1;
        for (int i = 0; i < houseNums; i++) {
            if (delId == houses[i].getId()) {
                //要删除的房屋(id)，是数组下标为i的元素
                index = i;
            }
        }
        if (index == -1) {
            //说明delId在数组中不存在
            return false;
        }

        //如果找到，开始删除
        for (int i = index; i < houseNums - 1; i++) {
            houses[i] = houses[i + 1];
        }
        //把当前存在的房屋信息的最后一个设置null
        houses[--houseNums] = null;
        return true;
    }

    //find方法，返回House对象或null
    public House findById(int findId){
        //遍历数组
        for (int i = 0; i < houseNums; i++) {
            if(findId==houses[i].getId()){
                return houses[i];
            }
        }

        return null;
    }
}
