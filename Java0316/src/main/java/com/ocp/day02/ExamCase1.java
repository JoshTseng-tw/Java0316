package com.ocp.day02;

public class ExamCase1 {

    public static void main(String[] args) {
        Exam a1 = new Exam("小明", 90, 70);
        System.out.println(a1.getPrintData());

        Exam a2 = new Exam();
        a2.name = "小英";
        a2.chinese = 32;
        a2.math = 55;
        System.out.println(a2.getPrintData());

        Exam a3 = new Exam("小華", 87, 50);
        System.out.println(a3.getPrintData());

        Exam a4 = new Exam();
        a4.name = "小美";
        a4.chinese = 82;
        a4.math = 45;
        System.out.println(a4.getPrintData());

    }
}
