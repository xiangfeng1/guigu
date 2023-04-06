package HomeWork;

import java.util.Scanner;
/*从键盘输入一个整数，判断它是不是5的倍数*/
public class HomeWork1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("请输入一个数：");
            int num = input.nextInt();
            //判断是不是5的倍数
            if (num % 5 == 0) {
                System.out.println(num+"是5的倍数");
                break;
            } else {
                System.out.println("不是5的倍数，是否再输一次？（1是，2否）");
                int shu = input.nextInt();
                //判断当不是5的倍数是是否再输一次
            if (shu != 1) {
                    break;
                }
            }
        }
        //关闭
        input.close();
    }
}
