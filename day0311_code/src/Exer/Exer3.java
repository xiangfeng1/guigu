package Exer;

import java.util.Scanner;

public class Exer3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个分数：");
        int score = input.nextInt();
        System.out.println(score>100||score<0 ? "输入有误":"分数为："+score);

        input.close();

    }
}
