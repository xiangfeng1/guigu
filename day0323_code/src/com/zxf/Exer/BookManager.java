package com.zxf.Exer;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {
    //页面
    public void startMenu() {
        int i = -100;
        do {
            System.out.println("欢迎使用图书管理系统");
            System.out.println("----------------");
            System.out.println("1.新增菜单");
            System.out.println("2.查看图书");
            System.out.println("3.删除图书");
            System.out.println("4.借出图书");
            System.out.println("5.归还图书");
            System.out.println("6.退出");
            System.out.println("--------------");
            System.out.print("请选择：");
            Scanner input = new Scanner(System.in);
            i = input.nextInt();

            switch (i) {
                case 0:
                    i -= 1;
                    break;
                case 1:
                    add();
                    a();
                    break;
                case 2:
                    System.out.println("--->查看图书");
                    search();
                    a();
                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:

                    break;
                case 6:

                    System.out.println("退出");
                    break;
            }

        } while (i < 0 || i > 6);

    }

    public void a(){
        System.out.print("请选择（0返回）：");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if (a == 0) {
            startMenu();
        }
    }

    //查看图书信息
    public void search() {
        book[] books = new book[3];
        System.out.println("序号\t\t\t状态\t\t\t名称\t\t\t\t\t借出日期");
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
    }

    //添加图书信息
    public void add(){
//        book book = new book();
//        int length = books.length+1;
//        System.out.println("");



        System.out.println("添加书籍中.....");

    }


}
