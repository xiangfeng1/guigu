package Exer;

import java.util.Scanner;

public class Exer5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入第一个数：");
        int num1 = input.nextInt();

        System.out.print("请输入第二个数：");
        int num2 = input.nextInt();

        System.out.print("请输入第三个数：");
        int num3 = input.nextInt();

        if (num1 > num2) {
            if (num2 > num3) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else if (num3 > num1) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }//2<1
        } else {
            if (num3 < num2) {
                System.out.println(num3 + " " + num2 + " " + num1);
            } else if (num3 > num1) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }

        }
    }
}
