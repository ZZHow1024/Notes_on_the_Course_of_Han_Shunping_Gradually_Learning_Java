package com.zzhow.enum_;

/**
 * 0431_Enum使用细节
 * 2024年2月11日
 *
 * @author ZZHow1024
 */
public class EnumDetail {
    public static void main(String[] args) {
        Music.ROCK.playing();
    }
}

class A {

}
//1. 使用enum关键字后，就不能再继承其他类了，
// 因为enum会隐式继承Enum，而Java是单继承机制
//2. enum实现的枚举类仍然是一个类，所以可以实现接口

interface IPlaying {
    public void playing();
}

enum Music implements IPlaying {
    ROCK("摇滚乐");

    private String name;

    private Music() {
    }

    private Music(String name) {
        this.name = name;
    }

    @Override
    public void playing() {
        System.out.println("播放" + name);
    }
}
