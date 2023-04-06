package Exer;

import java.util.Scanner;

public class Exer1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个整数：");
        int a = input.nextInt();
        System.out.print("请输入第二个整数：");
        int b = input.nextInt();

        System.out.println("它们的和为："+(a+b));
        System.out.println("它们的差为："+(a-b));
        System.out.println("它们的乘积为："+(a*b));
        System.out.println("它们的商为："+(double)a/b);
        System.out.println("它们的余数为："+(a%b));

        input.close();
    }
}
