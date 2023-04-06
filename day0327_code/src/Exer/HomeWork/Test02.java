package Exer.HomeWork;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入QQ号码：");
        String num = input.next();

        System.out.print("这个QQ号码是否正确：");
       if (num.matches("[1-9][0-9]{4,11}+")){
           System.out.println(true);
       }else {
           System.out.println(false);
       }

    }
}
