package com.zxf.HomeWork.HomeWork5;

import java.util.Comparator;

public class Test {
    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student("liusan",20,90.0);
        students[1] = new Student("lisi",22,90.0);
        students[2] = new Student("wangwu",20,99.0);
        students[3] = new Student("sunliu",22,100.0);

        System.out.println("按照成绩和年龄排序：");
        MyArrays.sort(students);
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("按照姓名排序：");
        MyArrays.sort(students, new Comparator<Student>() {

            @Override
            public int compare(Student o1, Student o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Student student : students) {
            System.out.println(student);
        }
    }
}