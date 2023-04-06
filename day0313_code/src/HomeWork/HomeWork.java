package HomeWork;

import java.util.Scanner;

public class HomeWork {
    public static void main(String[] args) {
        int year;
        int month;

        Scanner input  = new Scanner(System.in);
        //输入年份
        while (true){
            System.out.print("请输入年份：");
            year = input.nextInt();
            //判断年份必须大于1700
            if (year >1700) {
                break;
            }
        }

        //输入月份：
        while (true){
            System.out.print("请输入月份：");
             month = input.nextInt();
            if (month >0||month<=12) {
                break;
            }
        }

        //判断输入的month当前月的最大日
        int monthMAXDay=0;
        for (int i = 1; i <=month ; i++) {
        }

    }
}
