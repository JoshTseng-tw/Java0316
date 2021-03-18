
package com.ocp.day02;


public class Exam {
    //屬性
    String name;
    int chinese;
    int math;
    
    //建構子
    Exam (String n, int c, int m) {
        this.name = n;
        this.chinese = c;
        this.math = m;
    }
    
    Exam (){
        
    }
    
    //計算方法
    int getSum(){
        int sum = chinese + math;
        return sum;
    }
    
    double getAvg(){
        double avg = getSum()/2.0;
        return avg;
    }
    
    String getResultValue (){
        double avg = getAvg();
        String result = (avg > 60)? "及格":"不及格";
        return result;
    }
    //void print(){
        //int sum = getSum();
        //double avg = getAvg();
        //System.out.printf("姓名: %s, 國文: %d, 數學: %d, 總分: %d, 平均: %.1f, 結果:%s\n", name,chinese,math,sum,avg,result);
    
    String getPrintData(){
        return String.format("姓名: %s, 國文: %d, 數學:%d, 總分: %d, 平均: %.1f, 結果: %s\n", name,chinese,math,getSum(),getAvg(),getResultValue());
        
        
    
    
    }
    
    
}
