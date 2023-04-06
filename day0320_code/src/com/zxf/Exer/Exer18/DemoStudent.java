package com.zxf.Exer.Exer18;

import java.util.Scanner;

public class DemoStudent {
    public static  void main(String[] args) {
        Student[] students = new Student[2];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
             students[i] = new Student();
            System.out.println("请输入第"+(i+1)+"姓名");
            students[i].name = scanner.next();
            System.out.println("请输入第"+(i+1)+"成绩");
            students[i].score = scanner.nextInt();
        }

        Student.sort(students);

        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getinfo());
        }

    }
}
