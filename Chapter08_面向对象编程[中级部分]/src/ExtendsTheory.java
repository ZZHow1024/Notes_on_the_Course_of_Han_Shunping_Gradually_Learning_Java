//DNX写于2024年1月25日
public class ExtendsTheory {
    public static void main(String[] args) {
        Son son = new Son(); // 内存的布局
    }
}

class GrandPa { // Father 的父类
    String name = "大头爷爷";
    String hobby = "旅游";
}

class Father extends GrandPa { // Son 的父类
    String name = "小头爸爸";
    int age = 30;
}

class Son extends Father { // Father 的子类
    String name = "大头儿子";
}