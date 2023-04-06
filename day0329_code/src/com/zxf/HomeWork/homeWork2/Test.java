package com.zxf.HomeWork.homeWork2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Collection<Object> objects = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        boolean s=true;
        do {
            System.out.println("选择（1、录入；0退出）");
            int i = input.nextInt();
            if (i ==0) {
                s=false;
            }else if(i!=1){
                System.out.println("请重输！！");
            }else {
                Student student = new Student();
                System.out.print("姓名：");
                student.setName(input.next());
                System.out.print("年龄：");
                student.setAge(input.nextInt());
                objects.add(student);
            }

        }while (s);


        for (Object object : objects) {
            System.out.println(object);
        }



    }

}
