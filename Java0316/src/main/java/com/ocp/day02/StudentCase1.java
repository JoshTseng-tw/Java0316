
package com.ocp.day02;


public class StudentCase1 {
    public static void main(String[] args) {
        Student s1 = new Student("小明", 18, 170, 50);
        s1.print();
        //學生加入考試成績物件
        s1.exam = new Exam(s1.name, 80, 65);
        s1.print();
        //單獨列印出bmivalue資料
        System.out.println(s1.bmi.getBMIValue());
        //單獨列印出平均分數資料
        System.out.println(s1.exam.getAvg());
        //修改數學分數
        s1.exam.math=75;
        s1.print();
        
    }
}
