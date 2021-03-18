
package com.ocp.day02;

//設計計算BMI資源應該要有的資源和方法
public class BMI {
    //屬性定義區
    String name; //姓名
    double height; //身高
    double weight; //體重
    
    //建構子設計區
    BMI(String n, double h, double w) {
        name = n;
        height = h;
        weight = w;
    }
    
    BMI (){
        
    }
    
    
    
    //方法實作區
    //取得bmi值
    double getBMIValue () { //取得計算後的bmi資料
        double bmivalue = weight / Math.pow(height/100, 2); //計算
        return bmivalue; //回傳bmivalue (要回傳與方法簽章一樣的型別)
    }
    //取得bmi分析結果
    String getResultValue (){
        double bmivalue = getBMIValue(); //直接取得bmi的計算結果
        String resultValue = (bmivalue > 23) ? "過重" : (bmivalue < 18) ? "過輕" : "正常";
        return resultValue;
    }
    //列印資料
    void print (){
        double bmivalue = getBMIValue();
        String resultValue = getResultValue();
        
        System.out.printf("姓名: %s 身高: %.2f 體重: %.2f BMI: %.2f 結果: %s\n", name, height, weight, bmivalue, resultValue);
    }
}
