package Exer;

import java.util.Scanner;

/*
求ax<sup>2</sup>+bx+c=0方程的根，其中a,b,c分别为函数的参数。
如果a≠0，那么：
（1）当b<sup>2</sup>-4ac>0，则一元二次方程有两个实数解：
（2）当b<sup>2</sup>-4ac=0，则一元二次方程有一个实数解
（3）当b<sup>2</sup>-4ac<0，则一元二次方程在实数范围内无解；

如果a=0,b≠0，那么一元一次方程有一个解
如果a=0,b=0，那么参数输入有误，该式子不是方程。
提示1：Math.sqrt(num);  sqrt指平方根
*/
public class Exercise8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入第一个参数a:");
        int a = input.nextInt();

        System.out.print("请输入第二个参数b:");
        int b = input.nextInt();

        System.out.print("请输入第三个参数c:");
        int c = input.nextInt();

        if (a == 0 && b == 0) {
            System.out.println("参数输入有误，该式子不是方程");
        } else if (a == 0) {
            double x = -c / b;
            System.out.println("一元一次方程有一个解:" + x);
        } else {
            int d = b * b - 4 * a * c;
            if (d > 0) {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);

                System.out.println("一元二次方程有两个根：" + x1 + "," + x2);
            } else if (d == 0) {
                double x = -b / (2 * a);
                System.out.println("一元二次方程有1个根：" + x);
            } else {
                System.out.println("一元二次方程在实数范围内无解");
            }
        }

    }
}
