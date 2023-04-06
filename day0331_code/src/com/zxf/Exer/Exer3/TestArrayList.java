package com.zxf.Exer.Exer3;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> objects = new ArrayList<>();
        while (objects.size()<10){
            int num=(int)(Math.random()*10)*2;
            objects.add(num);
        }
        for (Object object : objects) {
            System.out.print(object+" ");
        }
        System.out.println();
        System.out.println("---------------------------");

        ListIterator<Integer> listIterator = objects.listIterator(objects.size());
        while (listIterator.hasPrevious()){
            Integer previous = listIterator.previous();
            System.out.print(previous+" ");
        }

        System.out.println();
        System.out.println("------------------");
        int index = objects.indexOf(12);
        if (index != 0) {

            List<Integer> integers = objects.subList(0, index+1);
            System.out.println(integers);
        }else {
            System.out.println("不存在12");
        }
    }
}
