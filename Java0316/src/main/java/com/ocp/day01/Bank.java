
package com.ocp.day01;
public class Bank {
    public static void main(String[] args) {
        Account a01 = new Account(); //建立 a01帳戶
        Account a02 = new Account();
        Account a03 = new Account();   
        a01.balance = 1000;
        a02.balance = 2000;
        a03.balance = 3000;
        System.out.printf("a01 帳戶餘額  %,d\n", a01.balance);
        System.out.printf("a02 帳戶餘額  %,d\n", a02.balance);
        System.out.printf("a03 帳戶餘額  %,d\n", a03.balance);
        //存款
        System.out.println("存款後");
        a01.deposit(500);
        System.out.printf("a03 帳戶餘額  %,d\n", a03.balance);
    }
}
