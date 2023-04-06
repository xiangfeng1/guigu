package Exer;
/* 这一天是这一年的第几天
（1）已知平年12个月每个月的总天数是{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30,31}，
（2）从键盘输入年，月，日，分别用year，month，day变量接收
（3）计算这一天是这一年的第几天。
（4）提示：考虑闰年
闰年的判断标准是：
（1）年份year可以被4整除，但不能被100整除
（2）或年份year可以被400整除*/
import java.util.Scanner;
public class TestArray4 {
    public static void main(String[] args) {
        int[] pinDays = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        Scanner input = new Scanner(System.in);
        //输入年份，年份大于0
        int year;
        while (true) {
            System.out.println("请输入年份：");
            year = input.nextInt();
            if (year > 0) {
                break;
            }
        }
        //判断输入年份是闰年还是平年
        boolean rp=year % 4 == 0 && year % 100 != 0 || year % 400 == 0?true:false;
        //输入月份
        int month;
        while (true) {
            System.out.println("请输入月份：");
            month = input.nextInt();
            if (month > 0 && month < 13) {
                break;
            }
        }
        //查询输入月份最大的day
        int monthMaxDay = 0;
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            monthMaxDay += 30;
        } else if (month == 2) {
            if (rp==true) {
                monthMaxDay += 29;
            } else {
                monthMaxDay += 28;
            }
        } else {
            monthMaxDay += 31;
        }
        //输入日
        int day;
        while (true) {
            System.out.println("请输入日：");
            day = input.nextInt();
            if (day <= monthMaxDay) {
                break;
            } else {
                System.out.println("超过本月最大日");
            }
        }
        //计算和
        int sum = 0;
        sum += day;
        //如果是闰年，2月份天数29
        if (rp == true) {
            pinDays[1]=29;
        }
        for (int i = 1; i < month; i++) {
            if (rp==true) {
                sum += pinDays[i - 1];
            } else {
                sum += pinDays[i - 1];
            }
        }
        System.out.println("这一天是这一年的第" + sum + "天");
    }
}
