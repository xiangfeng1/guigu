package Exer;

import java.util.Scanner;

public class Exer2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入年份：");
        int year =input.nextInt();

            System.out.println((year%4==0&&year%100!=0||year%400==0)?"今年是闰年，一共366天":"今年是平年，一共365天");

    }
}
