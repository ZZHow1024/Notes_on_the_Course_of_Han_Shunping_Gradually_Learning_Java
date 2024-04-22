//ZZHow写于2024年1月26日
public class DynamicBinding {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum()); // 30
        System.out.println(a.sum1()); // 30
    }
}

class A{
    public int i = 10;

    public int sum(){
        return getI() + 10;
    }

    public int sum1(){
        return i + 10;
    }

    public int getI(){
        return i;
    }
}

class B extends A{
    public int i = 20;

//    public int sum(){
//        return getI() + 10;
//    }

    public int sum1(){
        return i + 10;
    }

    public int getI(){
        return i;
    }
}