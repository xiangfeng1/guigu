package Exer.HomeWork;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String s = input.next();
        StringBuilder s2= new StringBuilder(s);
        StringBuilder s3 = s2.reverse();
        System.out.println(s3);
    }
}
