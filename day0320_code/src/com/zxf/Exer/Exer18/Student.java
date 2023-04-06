package com.zxf.Exer.Exer18;

public class Student {
    public String name;
    public int score;

    public  String getinfo(){
        return "姓名为"+name+"，成绩为"+score;
    }

    public static Student[] sort(Student[] students){
        for (int i = 0; i <students.length-1 ; i++) {
            for (int j =0; j <students.length-1-i; j++) {
                if (students[j].score>students[j+1].score) {
                    Student temp=students[j];
                    students[j]=students[j+1];
                    students[j+1]=temp;
                }
            }
        }
        return students;
    }

}
