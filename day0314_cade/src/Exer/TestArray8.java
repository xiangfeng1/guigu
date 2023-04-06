package Exer;

import java.util.Scanner;

/*找出最高分同学的姓名
案例需求：
- 从键盘输入本组学员的人数
- 再分别从键盘输入本组学员的姓名和成绩
- 找出最高分同学的姓名*/
public class TestArray8 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        //输入小组人数
        while (true) {
            System.out.print("请输入小组人数：");
            num = input.nextInt();
            if (num > 0) {
                break;
            }
        }
        //输入成员姓名
        String[] names = new String[num];
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入" + (i + 1) + "成员姓名：");
            names[i] = input.next();
        }
        //输入成绩
        int[] scores = new int[num];
        for (int i = 0; i < scores.length; i++) {
            System.out.println("请输入" + names[i] + "的成绩：");
            scores[i] = input.nextInt();
        }
        //找到最大成绩
        int maxsore = scores[0];
        int index = 0;
        for (int i = 0; i < scores.length; i++) {
            if (maxsore < scores[i]) {
                maxsore = scores[i];
                index = i;
            }
        }
        System.out.println("最高分成绩是：" + maxsore);
        //找到最高成绩（可能不是一个人）
        System.out.println("获得最高分的有：");
        for (int i = 0; i < names.length; i++) {
            if (maxsore == scores[i]) {
                System.out.println(names[i]);
            }

            input.close();
        }
    }
}