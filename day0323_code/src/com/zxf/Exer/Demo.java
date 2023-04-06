package com.zxf.Exer;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        arrayList.add(new book(1, 0, "java基础教程", new Date(2023, 03, 23)));
        arrayList.add(new book(2, 1, "数据库技术"));
        arrayList.add(new book(3, 1, "java基础教程"));




        for (Object o : arrayList) {
            System.out.println(o);
        }

        BookManager b=new BookManager();


        //页面
        b.startMenu();



    }


}
