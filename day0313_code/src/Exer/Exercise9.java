package Exer;

import java.util.Scanner;

/*
    编写一个程序，为一个给定的年份找出其对应的中国生肖。中国的生肖基于12年一个周期，
    每年用一个动物代表：monkey（猴）、rooster（鸡）、dog（狗）、pig（猪）、rat（鼠）
    、ox（牛）、tiger（虎）、rabbit（兔）、dragon（龙）、snake（蛇）、horse（马）、
    sheep（羊）。

提示：2016年 猴 2016%12==0 ， 2017年：鸡   2017 % 12 == 1*/
public class Exercise9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入一个年份：");
        int year = scanner.nextInt();
        switch (year % 12) {
            case 0:
                System.out.println(year + "是猴年");
                break;
            case 1:
                System.out.println(year + "是鸡年");
                break;
            case 2:
                System.out.println(year + "是狗年");
                break;
            case 3:
                System.out.println(year + "是猪年");
                break;
            case 4:
                System.out.println(year + "是鼠年");
                break;
            case 5:
                System.out.println(year + "是牛年");
                break;
            case 6:
                System.out.println(year + "是虎年");
                break;
            case 7:
                System.out.println(year + "是兔年");
                break;
            case 8:
                System.out.println(year + "是龙年");
                break;
            case 9:
                System.out.println(year + "是蛇年");
                break;
            case 10:
                System.out.println(year + "是马年");
                break;
            case 11:
                System.out.println(year + "是羊年");
                break;
            default:
                System.out.println("错误");
        }
        scanner.close();
    }
}
