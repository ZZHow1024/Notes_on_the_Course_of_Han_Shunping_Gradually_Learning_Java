//DNX写于2024年1月24日
public class Encapsulation {
    public static void main(String[] args) {
        Person person = new Person();

        person.setName("Jack");
        person.setAge(18);
        person.setSalary(30000);

        person.info();

        System.out.println("==在Person类外调用getXxx方法查询信息==");
        System.out.println("name:" + person.getName());
        System.out.println("age:" + person.getAge());
        System.out.println("salary:" + person.getSalary());

        System.out.println("==尝试通过构造器传入超过范围的信息==");
        Person person1 = new Person("abcdefghijklmn", 300, 50000);
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
    //我们可以将set方法写在构造器中，这样仍然可以对数据进行校验。
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        //加入对数据的校验
        if (2 <= name.length() && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("姓名长度不在范围(2-6)内，已设定为默认值“无名”。");
            this.name = "无名";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (1 <= age && age <= 120) {
            this.age = age;
        } else {
            System.out.println("您输入的年龄不在范围(1-120)内，已设定为默认值18。");
            this.age = 18;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void info() {
        System.out.println("==Person的属性==");
        System.out.println("name:" + name);
        System.out.println("age:" + age);
        System.out.println("salary:" + salary);
    }
}