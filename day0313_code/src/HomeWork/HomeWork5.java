package HomeWork;
/*（1）定义变量week赋值为上一年最后一天的星期值，例如：2021年12月31日的星期值5，
（2）定义变量year、month、day，分别赋值今年（例如：2022年）某一天的年、月、日值。
（3）计算这一天是星期几。
（4）开发提示
- 需要计算这一天是今年（例如：2022年）的第几天，即今年已经过了几天了（总天数）
- 再用（总天数 + 5 ）% 7 的结果来判断是星期几
（5）每个月总天数：
- 平年的2月份有28天，闰年的2月份有29天。
- 1月、3月、5月、7月、8月、10月、12月有31天，
- 4月、6月、9月、11月有30天。
（6）闰年的判断标准是：
- 年份year可以被4整除，但不能被100整除
- 或者年份year可以被400整除*/
public class HomeWork5 {
    public static void main(String[] args) {
        int week = 6;
        int year=2023;
        int month=3;
        int day=13;

        int daySum=0;

        switch (month){
            case 12:
                daySum+=30;
            case 11:
                daySum+=31;
            case 10:
                daySum+=30;
            case 9:
                daySum+=31;
            case 8:
                daySum+=31;
            case 7:
                daySum+=30;
            case 6:
                daySum+=31;
            case 5:
                daySum+=30;
            case 4:
                daySum+=31;
            case 3:
                if (year%4==0&&year%100!=0||year%400==0) {
                    daySum+=29;
                }else {
                    daySum+=28;
                }

            case 2:daySum+=31;
            case 1:
                daySum+=day;
        }
        week=(daySum+week)%7;
        System.out.print(year + "年" + month + "月" + day + "日是星期");
        switch (week) {
            case 0:
                System.out.println("日");
                break;
            case 1:
                System.out.println("一");
                break;
            case 2:
                System.out.println("二");
                break;
            case 3:
                System.out.println("三");
                break;
            case 4:
                System.out.println("四");
                break;
            case 5:
                System.out.println("五");
                break;
            case 6:
                System.out.println("六");
                break;
        }
    }
}
