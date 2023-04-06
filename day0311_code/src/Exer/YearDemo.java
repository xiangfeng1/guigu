package Exer;

import java.util.Scanner;

public class YearDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year = scanner.nextInt();
        System.out.println((year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ? "今年是闰年" : "今年是平年");



        scanner.close();
    }
}