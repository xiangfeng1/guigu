package Exer;

import java.util.Scanner;

/*假设你想开发一个玩彩票的游戏，程序随机地产生一个两位数的彩票，提示用户输入一个两位数，
然后按照下面的规则判定用户是否能赢。
1)如果用户输入的数匹配彩票的实际顺序，奖金10 000美元
2)如果用户输入的所有数字匹配彩票的所有数字，但顺序不一致，奖金 3 000美元。
3)如果用户输入的一个数字仅满足顺序情况下匹配彩票的一个数字，奖金1 000美元。
4)如果用户输入的一个数字仅满足非顺序情况下匹配彩票的一个数字，奖金500美元。
5)如果用户输入的数字没有匹配任何一个数字，则彩票作废。
提示：使用Math.random() 产生随机数
Math.random() 产生[0,1)范围的随机值
Math.random() * 90：[0,90)
Math.random() * 90 + 10：[10,100) 即得到  [10,99]
使用(int)(Math.random() * 90  + 10)产生一个两位数的随机数。*/
public class Exercise7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //[n,m]范围的随机数Math.random()*(m-n)+n
        int randomNum = (int)( Math.random() * 90 + 10);
        System.out.println(randomNum);

        System.out.println("请输入一个两位数");
        int inputNum = input.nextInt();

        int inputNumge = inputNum % 10;
        int inputNumshi = inputNum / 10;
        int randomNumge = randomNum % 10;
        int randomNumshi = randomNum / 10;

        if (inputNumge == randomNumge && inputNumshi == randomNumshi) {
            System.out.println("奖金10000美元");
        } else if (inputNumge == randomNumshi && inputNumshi == randomNumge) {
            System.out.println("奖金 3000美元");
        } else if (inputNumge == randomNumge || inputNumshi == randomNumshi) {
            System.out.println("奖金 1000美元");
        } else if (inputNumge == randomNumshi || inputNumshi == randomNumge) {
            System.out.println("奖金 500美元");
        } else {
            System.out.println("谢谢惠顾！！！");
        }

        input.close();
    }
}
