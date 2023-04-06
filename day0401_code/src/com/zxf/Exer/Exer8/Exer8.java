package com.zxf.Exer.Exer8;

import java.util.*;

public class Exer8 {
    public static void main(String[] args) {

        HashMap<Integer, ArrayList<String>> hashMap = new HashMap<>();
        Scanner input = new Scanner(System.in);

        for (int i = 0; i <2 ; i++) {
            ArrayList<String> list = new ArrayList<>();
            int group=i+1;
            for (int j = 0; j <2 ; j++) {
                System.out.print("请输入"+group+"组"+(j+1)+"姓名：");
                String name = input.next();
                list.add(name);
            }
            hashMap.put(group,list);
        }
        Set<Map.Entry<Integer, ArrayList<String>>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, ArrayList<String>> entry : entries) {
            System.out.println("组号：" + entry.getKey());
            System.out.print("组员们有：");
            ArrayList<String> group = entry.getValue();
            for (String s : group) {
                System.out.print(s+"\t");
            }
            System.out.println();
        }

    }
}
