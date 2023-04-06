package HomeWork;

public class HomeWork2 {
    public static void main(String[] args) {
        System.out.println("今年是闰年吗？" + isLeapYear(2023));
        System.out.println("2月份名是" + monthName(2));
        System.out.println("2023年2月总天数：" + totalDaysOfMonth(2023, 2));
        System.out.println("2023年总天数：" + totalDaysOfYear(2023));
        System.out.println("2023年5月6日是这一年的几天？" + daysOfTheYear(2023, 5, 6));
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static int totalDaysOfYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    public static int totalDaysOfMonth(int year, int month) {
        if (month == 4 || month == 6 || month == 9 || month == 11) {
            return 30;
        }
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 31;
    }

    public static int daysOfTheYear(int year, int month, int day) {
        int days = day;
        for (int i = 1; i < month; i++) {
            if (i == 2) {
                days += isLeapYear(year) ? 29 : 28;
            } else if (i == 4 || i == 6 || i == 9 || i == 11) {
                days += 30;
            } else {
                days += 31;
            }
        }
        return days;
    }

    public static String monthName(int month) {
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        return monthNames[month - 1];
    }
}
