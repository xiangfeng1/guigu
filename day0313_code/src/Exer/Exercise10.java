package Exer;

import java.util.Scanner;
/*赌数游戏：随机产生3个1-6的整数，如果三个数相等，那么称为“豹子”，如果三个数之和大于9
          ,称为“大”，如果三个数之和小于等于9，称为“小”，用户从键盘输入押的是“豹子”、
          “大”、“小”，并判断是否猜对了
提示：随机数  Math.random()产生 [0,1)范围内的小数*/
public class Exercise10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请压宝（豹子，大，小）：");
        String ya = input.next();

        int a = (int) (Math.random() * 6 + 1);
        int b = (int) (Math.random() * 6 + 1);
        int c = (int) (Math.random() * 6 + 1);
        boolean jieguo =false;
        switch (ya) {
            case "豹子":
                jieguo = (a == b && b == c) ? true : false;
                break;
            case "大":
                jieguo = ((a+b+c)>9) ? true : false;
                break;
            case "小":
                jieguo = ((a+b+c)<=9) ? true : false;
                break;
            default:
                System.out.println("输入有误");
        }
        System.out.println("a,b,c是:"+a+" "+b+" "+c);
        System.out.println(jieguo?"给你钱":"拿来吧你");

        input.close();
    }
}
