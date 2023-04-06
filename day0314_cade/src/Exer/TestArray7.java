package Exer;

import java.util.Scanner;
/*有10个评委给参加编程比赛的某个选手的作品打分，
从键盘输入10个评委的分数，并存储到一维数组中。
然后求选手的最后得分（去掉一个最高分和一个最低分后其余8位评委打分的平均值）*/
public class TestArray7 {
    public static void main(String[] args) {
        int[] scores=new int[10];

        int sum=0;
        Scanner input = new Scanner(System.in);
        for (int i = 0; i <scores.length ; i++) {
            System.out.println("分数为：");
            scores[i]=input.nextInt();
        }
        int max=scores[0];
        int min=scores[0];
        for (int i = 0; i <scores.length ; i++) {
            if (scores[i]>max) {
                max=scores[i];
            }
            if (scores[i]<min) {
                min=scores[i];
            }else
            sum+=scores[i];
        }
        double c=(sum-max-min)/(scores.length-2);
        System.out.println("最大值为："+max);
        System.out.println("最小值为："+min);
        System.out.println("去掉一个最高分去掉一个最低分，最后得分是："+c);
    }
}
