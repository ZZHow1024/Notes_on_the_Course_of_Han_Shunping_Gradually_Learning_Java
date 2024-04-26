package com.zzhow.generic;

import org.junit.jupiter.api.Test;

import java.util.*;

/**
 * 2024年4月26日
 *
 * @author ZZHow
 */
public class GenericHomework {
    /*
    - 案例：
        - 定义个泛型类 DAO<T>，在其中定义一个 Map 成员变量，Map 的键为 String 类型，值为 T 类型。
        - 创建一下方法：
            1. public void save(String id, T entity)：保存 T 类型的对象到 Map 成员变量中
            2. public T get(String id)：从 map 中获取 id 对应的对象
            3. public void update(String id, T entity)：替换 map 中 key为 id 的内容,改为 entity 对象
            4. public List<T> list()：返回 map 中存放的所有 T 对象
            5. public void delete(String id)：删除指定 id 对象
        - 定义一个 User 类：
            - 包含：private 成员变量（int 类型）id, age（String 类型）name。
        - 创建 DAO 类的对象，分别调用其 save、get、update、list、delete 方法来操作 User 对象，使用 Junit 单元测试类进行测试。
     */
    public static void main(String[] args) {
        //使用 JUnit 测试
    }

    @Test
    public void testList() {
        //给 T 指定类型为 User
        DAO<User> dao = new DAO<>();

        dao.save("01", new User(1, 5, "Tom"));
        dao.save("02", new User(2, 3, "Jerry"));
        dao.save("03", new User(3, 7, "Spike"));

        List<User> list = dao.list();
        System.out.println("list = " + list);

        dao.update("03", new User(5, 5, "Mike"));
        System.out.println("===修改 03 后===");
        list = dao.list();
        System.out.println("list = " + list);

        dao.delete("02");
        System.out.println("===删除 02 后===");
        list = dao.list();
        System.out.println("list = " + list);

        System.out.println("===查询===");
        System.out.println("id = 01 的人是：" + dao.get("01"));
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User() {
    }

    public User(int id, int age, String name) {
        this.id = id;
        this.age = age;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

//泛型类 DAO
class DAO<T> {
    private Map<String, T> map = new HashMap<>();

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    //遍历 map [k-v]，将 map 的所有 value(entity)，封装到 ArrayList 返回即可
    public List<T> list() {
        //创建 ArrayList
        List<T> list = new ArrayList<>();

        //遍历 map
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            //map.get(key) 返回的 User 的对象 -存进-> ArrayList
            list.add(get(key));
        }

        return list;
    }

    public void delete(String id) {
        map.remove(id);
    }

    public void save(String id, T entity) {
        map.put(id, entity);
    }
}
