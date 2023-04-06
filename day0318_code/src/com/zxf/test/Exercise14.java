package com.zxf.test;

import com.zxf.util.Student;

public class Exercise14 {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name="张祥丰1";
        student1.score=55;
        student2.name="张祥丰2";
        student2.score=59;

        System.out.println(student1.name);
        System.out.println(student1.score);
        System.out.println(student2.name);
        System.out.println(student2.score);

    }
}
