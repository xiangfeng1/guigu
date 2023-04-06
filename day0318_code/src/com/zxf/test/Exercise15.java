package com.zxf.test;

import com.zxf.util.Employee;
import com.zxf.util.MyDate;

public class Exercise15 {
    public static void main(String[] args) {
        Employee s1=new Employee();
        Employee s2=new Employee();


        s1.name="张祥丰1";
        s1.birthday=new MyDate();
        s1.birthday.year=2002;
        s1.birthday.month=4;
        s1.birthday.date=2;

        s2.name="张祥丰";
        s2.birthday=new MyDate();
        s2.birthday.year=2000;
        s2.birthday.month=6;
        s2.birthday.date=26;

        System.out.println("e1的员工的姓名：" + s1.name + "，生日：" + s1.birthday.year +"年" + s1.birthday.month + "月" + s1.birthday.date +"日");
        System.out.println("e2的员工的姓名：" + s2.name + "，生日：" + s2.birthday.year +"年" + s2.birthday.month + "月" + s2.birthday.date+"日");
    }


    }


