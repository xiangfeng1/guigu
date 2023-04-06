package Exer;

import java.util.Scanner;

public class Exer4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("决定岳小鹏命运的时刻（输入分数）：");
        int score =input.nextInt();
        if (score>100||score<0){
            System.out.println("成绩输入错误");
        }else if (score==100){
            System.out.println("一辆BMW");
        }else if(score>=80){
            System.out.println("奖励一台外星人笔记本");
        } else if (score>=60) {
            System.out.println("奖励一部华为手机最新款");
        }else {
            System.out.println("什么奖励也没有");
        }

        input.close();
    }
}
