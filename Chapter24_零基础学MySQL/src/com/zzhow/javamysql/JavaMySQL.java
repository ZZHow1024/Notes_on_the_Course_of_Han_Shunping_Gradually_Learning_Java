package com.zzhow.javamysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 * @author ZZHow
 * @date 2024/6/20
 */
public class JavaMySQL {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("user: ");
        String user = scanner.next();
        System.out.print("password: ");
        String password = scanner.next();
        System.out.print("database: ");
        String database = scanner.next();

        try {
            //加载类
            Class.forName("com.mysql.jdbc.Driver");

            //得到 MySQL 连接
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + database, user, password);

            //编写 SQL 语句[create, select, insert, update, delete...]
            //  1.创建一个商品goods表，选用适当的数据类型
            String sql1 = "create table goods (id int, name varchar(32), price double, introduce text)";
            //  2.添加2条数据
            String sql2 = "insert into goods values(1, 'Phone', 1999, 'That was so cool!')";
            //  3.删除表goods
            String sql3 = "drop table goods";

            //得到 statement 对象
            Statement statement = connection.createStatement();

            //把 SQL 语句发送给 MySQL 执行
            statement.executeUpdate(sql1);
            statement.executeUpdate(sql2);

            System.out.print("Do you want to delete the goods table?(y/n)");
            String answer = scanner.next();
            if (answer.equals("y")) {
                statement.executeUpdate(sql3);
            }

            statement.close();
            connection.close();
            System.out.println("SQL 语句执行完毕！");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Exception message: " + e.getMessage());
        }
    }
}
