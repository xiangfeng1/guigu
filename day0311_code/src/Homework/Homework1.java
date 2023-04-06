package Homework;

import java.util.Scanner;

public class Homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个数：");
        int num = input.nextInt();
        if (num % 5 == 0 && num != 0) {
            System.out.println(num + "是5的倍数");
        } else if (num == 0) {
            System.out.println("输入为0");
        } else {
            System.out.println("不是5的倍数");
        }
    }
}
