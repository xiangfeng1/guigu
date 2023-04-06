package Exer;

import java.util.Scanner;

/*输入两个正整数m和n，求其最大公约数和最小公倍数*/
public class DoWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int m;
        int n;
        do {
            System.out.println("请输入第一个正整数m:");
            m = input.nextInt();
            if (m <= 0) {
                System.out.println("输入错误！");
            } else {
                break;
            }
        } while (true);
        do {
            System.out.println("请输入第二个正整数n:");
            n = input.nextInt();
            if (n <= 0) {
                System.out.println("输入错误！");
            } else {
                break;
            }
        } while (true);
        int max = m > n ? m : n;
        int min = m > n ? n : m;
        int maxYue = min;
        while (maxYue > 0) {
            if (m % maxYue == 0 && n % maxYue == 0) {
                break;
            }
            maxYue--;
        }
        System.out.println(maxYue + "是" + m + "和" + n + "的最大公约数");
        int maxBei = max;
        while (maxBei < m * n) {
            if (maxBei % m == 0 && maxBei % n == 0) {
                break;
            }
            maxBei++;
        }
        System.out.println(maxBei + "是" + m + "和" + n + "的最小公倍数");

        input.close();
    }
}
