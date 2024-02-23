package com.dnx.houserent.view;

import com.dnx.houserent.domain.House;
import com.dnx.houserent.service.HouseService;
import com.dnx.houserent.utils.Utility;

/**
 * @author DNX
 * 2024年2月3日
 * 1.显示界面
 * 2.接收用户的输入
 * 3.调用HouseService完成对房屋信息的各种操作
 */
public class HouseView {
    private boolean loop = true; // 控制显示菜单
    private char key = ' '; // 接收用户选择
    private HouseService houseService = new HouseService(10); // 设置数组的大小是10

    //显示主菜单
    public void mainMenu() {

        do {
            System.out.println("\n==========房屋出租系统菜单==========");
            System.out.println("\t\t\t1.新增房源");
            System.out.println("\t\t\t2.查找房屋");
            System.out.println("\t\t\t3.删除房屋信息");
            System.out.println("\t\t\t4.修改房屋信息");
            System.out.println("\t\t\t5.显示房屋信息");
            System.out.println("\t\t\t6.退出");
            System.out.print("请输入选择(1-6)：");
            key = Utility.readChar();
            switch (key) {
                case '1':
                    addHouse();
                    break;
                case '2':
                    findHouse();
                    break;
                case '3':
                    delHouse();
                    break;
                case '4':
                    update();
                    break;
                case '5':
                    listHouses();
                    break;
                case '6':
                    exit();
                    break;
            }
        } while (loop);
    }

    //编写listHouses()显示房屋列表
    public void listHouses() {
        System.out.println("--------------------------房屋列表--------------------------");
        System.out.println("编号\t\t房主\t\t电话\t\t地址\t\t月租\t\t状态（未出租 / 已出租）");
        House[] houses = houseService.list();
        for (int i = 0; i < houses.length; i++) {
            if (houses[i] == null) {
                break;
            }
            System.out.println(houses[i]);
        }
        System.out.println("--------------------------显示完毕--------------------------");
    }

    //编写addHouse()接收输入，创建House对象，调用add方法
    public void addHouse() {
        System.out.println("--------------------------添加房屋--------------------------");
        System.out.print("姓名：");
        String name = Utility.readString(8);
        System.out.print("电话：");
        String phone = Utility.readString(12);
        System.out.print("地址：");
        String address = Utility.readString(16);
        System.out.print("月租：");
        int rent = Utility.readInt();
        System.out.print("状态：");
        String state = Utility.readString(3);
        //创建一个新的House对象，注意id是系统分配的。
        House newHouse = new House(0, name, phone, address, rent, state);
        if (houseService.add(newHouse)) {
            System.out.println("添加房屋成功！");
        } else {
            System.out.println("添加房屋失败！");
        }
    }

    //编写delHouse() 接收输入的id，调用Service 的del方法
    public void delHouse() {
        System.out.println("--------------------------删除房屋--------------------------");
        System.out.print("请输入要删除的房屋的编号(-1退出)：");
        int delId = Utility.readInt();
        if (delId == -1) {
            System.out.println("--------------------------退出删除--------------------------");
            return;
        }
        char choice = Utility.readConfirmSelection();
        if (choice == 'Y') {//真的删除
            if (houseService.del(delId)) {
                System.out.println("删除房屋信息成功！");
            } else {
                System.out.println("房屋编号不存在，删除失败！");
            }
        } else {
            System.out.println("放弃删除房屋信息。");
        }
    }

    //编写exit()，确认退出
    public void exit() {
        //这里我们使用Utility提供的方法，完成确认
        char c = Utility.readConfirmSelection();
        if (c == 'Y') {
            loop = false;
        }
    }

    //编写findHouse()，根据id查找房屋信息
    public void findHouse() {
        System.out.println("--------------------------查找房屋--------------------------");
        System.out.print("请输入要查找的房屋的编号(-1退出)：");
        int findId = Utility.readInt();
        if (findId == -1) {
            System.out.println("--------------------------退出查找--------------------------");
            return;
        }
        //调用方法
        House findResult = houseService.findById(findId);
        if (findResult != null) {
            System.out.println(findResult);
        } else {
            System.out.println("查找的房屋编号不存在！");
        }
    }

    //编写update()，修改房屋信息
    public void update() {
        System.out.println("--------------------------修改房屋--------------------------");
        System.out.print("请输入要修改的房屋的编号(-1退出)：");
        int updateId = Utility.readInt();
        if (updateId == -1) {
            System.out.println("--------------------------退出修改--------------------------");
            return;
        }
        House house = houseService.findById(updateId);
        if (house == null) {
            System.out.println("要修改的房屋编号不存在！");
            return;
        }

        System.out.print("姓名(" + house.getName() + ")：");
        String name = Utility.readString(8, "");
        if (!"".equals(name)) {
            //修改
            house.setName(name);
        }

        System.out.print("电话(" + house.getPhone() + ")：");
        String phone = Utility.readString(12, "");
        if (!"".equals(phone)) {
            //修改
            house.setPhone(phone);
        }

        System.out.print("地址(" + house.getAddress() + ")：");
        String address = Utility.readString(18, "");
        if (!"".equals(address)) {
            //修改
            house.setAddress(address);
        }

        System.out.print("租金(" + house.getRent() + ")：");
        int rent = Utility.readInt(-1);
        if (rent != -1) {
            //修改
            house.setRent(rent);
        }

        System.out.print("状态("+house.getState()+")：");
        String state = Utility.readString(3, "");
        if (!"".equals(state)){
            //修改
            house.setState(state);
        }
    }
}
