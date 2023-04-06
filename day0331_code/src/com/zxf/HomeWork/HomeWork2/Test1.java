package com.zxf.HomeWork.HomeWork2;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<Student> objects = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean a=true;
        while(a){
            System.out.print("选择（1、录入；0、退出）：");
            int i = scanner.nextInt();
            if (i==1) {
                Student student = new Student();
                System.out.print("姓名：");
                student.setName(scanner.next());
                System.out.print("年龄:");
                student.setAge(scanner.nextInt());
                objects.add(student);
            }else if (i==0){
                a=false;
            }else {
                System.out.println("重新输入（0或1）");
            }

        }


        for (Student object : objects) {
            System.out.println(object);
        }


        String str="";

        for (int i = 0; i <objects.size() ; i++) {
            Student student = new Student();
           str+= student.find(objects.get(i));
        }

        if (str.equals("null")) {
            System.out.println("没有找到！！！");
        } else {
            System.out.println(str+" ");
        }

    }
}
