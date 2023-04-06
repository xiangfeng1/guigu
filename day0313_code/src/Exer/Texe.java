package Exer;

import java.util.Scanner;

public class Texe {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m;
        int n;
        do {
            System.out.println("请输入第一个正整数m:");
            m = input.nextInt();
            if (m <= 0) {
                System.out.println("输入错误！");
            } else {
                break;
            }
        } while (true);
        do {
            System.out.println("请输入第二个正整数n:");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("输入错误！");
            } else {
                break;
            }
        } while (true);
        System.out.println(m);
        System.out.println(n);
    }
}
