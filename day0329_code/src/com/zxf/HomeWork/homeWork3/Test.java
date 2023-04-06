package com.zxf.HomeWork.homeWork3;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> arrays = new ArrayList<>();
        arrays.add(new Student("张三",98));
        arrays.add(new Student("李四",86));
        arrays.add(new Student("王五",85));
        arrays.add(new Student("赵六",98));
        arrays.add(new Student("钱七",98));

        double max=0;
        for (Object array : arrays) {
            Student student = (Student) array;
            if (student.getScore()>max) {
                max=student.getScore();
            }
        }

            int a=0;
           ArrayList arrayList= new ArrayList<>();
        for (Object array : arrays) {
            Student student = (Student) array;
            if (student.getScore() == max) {
                arrayList.add(student.getName());

            }
        }

        System.out.println("最高分："+max);
        System.out.println("最高分有"+arrayList);

    }
}
