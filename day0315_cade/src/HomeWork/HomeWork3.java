package HomeWork;

import java.util.Scanner;
/*先从键盘输入本组学员的人数，再从键盘输入本组学员的姓名和成绩，
  显示学员姓名和成绩。最后查找是否有满分(100)学员，如果有显示
  姓名，否则显示没有满分学员。*/
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //输入成员人数，成员人数必须大于0
        System.out.print("请输入成员人数：");
        int num;
        while (true) {
            num = input.nextInt();
            if (num > 0) {
                break;
            } else {
                System.out.println("成员人数不合法！！！请重输");
            }
        }
        //定义一个二维数组info[i][0]存姓名  info[i][1]存成绩
        String[][] info = new String[num][2];

        //
        for (int i = 0; i < info.length; i++) {
            System.out.println("请输入" + (i + 1) + "姓名：");
            info[i][0] = input.next();
            System.out.println("请输入" + (i + 1) + "成绩：");
            info[i][1] = input.next();
        }

        //判断是否有满分学员有的话sum+1
        int sum = 0;
        for (int i = 0; i < info.length; i++) {
            if (info[i][1].equals("100")) {
                sum += 1;
            }
        }
        //根据sum是否大于0来判断是否有满分学员
        if (sum > 0) {
            System.out.println("有满分学员，姓名为：");
            for (int i = 0; i < info.length; i++) {
                if (info[i][1].equals("100")) {
                    System.out.print(info[i][0] + " ");
                }
            }
        } else {
            System.out.println("没有满分学员");
        }


        input.close();
    }
}

