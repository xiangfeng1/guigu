package com.zxf.Exer.Exer7;

import java.util.HashMap;
import java.util.Scanner;

public class Exer7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<String, String> HashMaps = new HashMap<>();

        System.out.print("请输入小组人数：");
        int count=input.nextInt();
        for (int i = 0; i <count ; i++) {
            System.out.print("请输入姓名：");
            String name = input.next();
            System.out.print("请输入手机号码：");
            String phone= input.next();
            HashMaps.put(name,phone);
        }
        System.out.print("请输入查询的姓名：");
        String next = input.next();
        String a=HashMaps.get(next);
        if (a.equals(null)) {
            System.out.println("没找到！！！");
        }else {
            System.out.println("电话为:"+a);
        }

    }
}
