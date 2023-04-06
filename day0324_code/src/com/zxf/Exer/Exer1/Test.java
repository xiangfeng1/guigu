package com.zxf.Exer.Exer1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份值：");
        int year = input.nextInt();

        System.out.print("请输入月份值：");
        int monthValue = input.nextInt();
        Month month = Month.GetByValue(monthValue);
        System.out.println(month);

        System.out.println("月份总天数：" + month.length(year%4==0 && year%100!=0 || year%400==0));

        input.close();
    }
}
