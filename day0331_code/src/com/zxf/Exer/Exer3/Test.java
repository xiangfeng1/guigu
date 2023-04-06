package com.zxf.Exer.Exer3;

import java.util.HashSet;

public class Test {
    public static void main(String[] args) {
        HashSet<Integer> objects = new HashSet<>();
        Boolean a=true;
        while (a){
            objects.add(((int)(Math.random()*50)*2));
            if (objects.size()==10){
                a=false;
            }
        }
        for (Integer object : objects) {
            System.out.print(object+" ");
        }

    }
}
