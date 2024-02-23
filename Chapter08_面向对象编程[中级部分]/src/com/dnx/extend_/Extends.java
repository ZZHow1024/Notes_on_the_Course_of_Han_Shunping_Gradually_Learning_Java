package com.dnx.extend_;
//DNX写于2024年1月25日

public class Extends {
    public static void main(String[] args) {
        Pupil pupil = new Pupil();
        pupil.name = "小明";
        pupil.age = 11;
        pupil.testing();
        pupil.setScore(95);
        pupil.showInfo();

        Undergraduate undergraduate = new Undergraduate();
        undergraduate.name = "大明";
        undergraduate.age = 19;
        undergraduate.testing();
        undergraduate.setScore(99);
        undergraduate.showInfo();
    }

}
