package HomeWork;

import java.util.Scanner;

public class HomeWork9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入年份：");
        int year=input.nextInt();
        System.out.println("请输入月份：");
        int month=input.nextInt();
        System.out.println("请输入日：");
        int day=input.nextInt();
        input.close();
        int daysum=0;

        for (int i = 1; i <month ; i++) {
            if (i == 4||i==6||i==9||i==11) {
                daysum+=30;
            } else if (i==2) {
                if (year%4==0&year!=100||year%400==0) {
                    daysum+=29;
                }else {
                    daysum+=28;
                }
            } else {
                daysum+=31;
            }

        }
        daysum+=day;
        System.out.println("这一天是当年的第"+daysum+"天");

    input.close();
    }


}
