package Exer.Exer3;


import org.junit.Test;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Demo03 {
    @Test
    public void test01(){
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter df = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(df.format(now));

        df=DateTimeFormatter.ofPattern("yyyy年MM月dd日HH时mm分ss秒  SSS毫秒  E 是这一年的D天");
        String str= df.format(now);
        System.out.println(str);
    }

    @Test
    public void test02(){
        LocalDateTime localDateTime = LocalDateTime.now();
        LocalDateTime chicagoDateTime= LocalDateTime.now(ZoneId.of("America/Chicago"));
        Duration duration =  Duration.between(localDateTime,chicagoDateTime);
        System.out.println(duration);
    }
    @Test
    public void test03(){
        LocalDate localDate = LocalDate.now();

        Scanner input = new Scanner(System.in);
        System.out.print("请输入生日（格式为1995-05-01）：");
        String birthdayStr = input.next();
        input.close();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        LocalDate birthday = LocalDate.from(df.parse(birthdayStr));

        Period p = Period.between(localDate,birthday);
        System.out.println(p);
    }
    @Test
    public void t(){
        Scanner input = new Scanner(System.in);
        int num;
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        while (true) {
            System.out.println("请输入一个整数(1--7)：");
            num = input.nextInt();
            if (num > 0 && num < 8) {
                break;
            }
        }

        //输入的星期减1是数组下表
        System.out.println("星期" + num +"是" + week[num-1]);

        input.close();
    }
    }
