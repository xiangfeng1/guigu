package com.zxf.Exer.Exer1;

import java.util.Scanner;

public class TestDivide {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("请输入被除数：");
            int num1 = input.nextInt();
            System.out.print("请输入除数：");
            int num2 = input.nextInt();
            if (num1<=0 && num2<=0){
                System.out.println("重新输入");
        } else if (num1>0&&num2==0) {
            System.out.println("除数不为0");
        }else {
            System.out.println(num1/num2);
            break;
        }
        }

        try {
            System.out.print("请输入被除数：");
            int num3 = input.nextInt();
        }catch (Exception e){
            System.out.println("输入非法");
        }

        try{
            System.out.print("请输入除数：");
            int num4 = input.nextInt();
            if (num4 == 0) {
                System.out.println("除数不能为0");
            }
        }catch (Exception e){
            System.out.println("输入非法");
        }

    }
}
