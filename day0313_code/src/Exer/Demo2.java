package Exer;

/*（1）假设从2000年1月1日开始三天打鱼，两天晒网，
（2）从键盘输入今天的日期年、月、日，显示今天是打鱼还是晒网？
（3）开发提示：
- 先计算这一天是这一年的第几天，即总天数
- 再用总天数 % 5（三天打鱼两天晒网的周期），根据结果来判断是打鱼还是晒网
（4）每个月总天数：
- 平年的2月份有28天，闰年的2月份有29天。
- 1月、3月、5月、7月、8月、10月、12月有31天，
- 4月、6月、9月、11月有30天。
（5）闰年的判断标准是：
- 年份year可以被4整除，但不能被100整除
- 或者年份year可以被400整除*/
import java.util.Scanner;

public class Demo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int year;
        int month;
        int day;

        //判断输入的年份是否合法
        while (true) {
            System.out.println("请输入年份：");
            year = input.nextInt();
            if (year <= 2000) {
                System.out.println("年份要大于两千");
            } else {
                break;
            }
        }

        //判断输入的月份是否合法
        while (true) {
            System.out.println("请输入月份：");
            month = input.nextInt();
            if (month > 12 || month < 1) {
                System.out.println("输入月份有误！！！");
            } else {
                break;
            }
        }

        //获取输入月的month
        int monthDay;
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                monthDay = 29;
            } else {
                monthDay = 28;
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            monthDay = 30;
        } else {
            monthDay = 31;
        }

        //判断输入的日是否合法
        while (true) {
            System.out.println("请输入日份：");
            day = input.nextInt();
            if (day <= 0) {
                System.out.println("日期必须大于0");
            } else if (day > monthDay) {
                System.out.println(year + "年" + month + "月最多只有" + monthDay + "天");
            } else {
                break;
            }
        }

        //2000年到输入年一共的日
        int dayNum = 0;
        for (int i = 2000; i < year; i++) {//这个i代表年份
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                dayNum += 366;
            } else {
                dayNum += 365;
            }
        }

        //计算这一天是第year年的第几天
        for (int i = 1; i < month; i++) {
            if (i == 4 || i == 6 || i == 9 || i == 11) {
                dayNum += 30;
            } else if (i == 2) {
                if (year % 4 == 0 && year != 100 || year % 400 == 0) {
                    dayNum += 29;
                } else {
                    dayNum += 28;
                }
            } else {
                dayNum += 31;
            }
        }
        //加上输入的天数
        dayNum += day;
        //5天为一循环
        int panDuan = dayNum % 5;

        if (panDuan == 1 || panDuan == 2 || panDuan == 3) {
            System.out.println("打鱼");
        } else {
            System.out.println("晒网");
        }
    }
}
