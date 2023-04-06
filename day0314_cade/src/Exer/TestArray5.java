package Exer;

import java.util.Scanner;

/*用一个数组存储本组学员的姓名，先从键盘输入小组人数，
再从键盘输入每一个学员的姓名，然后遍历显示。*/
public class TestArray5 {
    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.print("请输入小组人数：");
            num = input.nextInt();
            if (num > 0) {
                break;
            }
        }

        String[] names = new String[num];
        for (int i = 0; i < names.length; i++) {
            System.out.println("请输入" + (i + 1) + "成员姓名：");
            names[i] = input.next();
        }
        System.out.println("小组人数为：" + num);
        System.out.print("成员姓名为：");
        for (int j = 0; j < names.length; j++) {
            System.out.print(names[j] + "\t、");
        }

        input.close();
    }
}
