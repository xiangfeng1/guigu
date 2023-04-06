package com.zxf.Exer.Exer3;

import java.util.HashSet;
public class Text {
    public static void main(String[] args) {
        HashSet<Object> objects = new HashSet<>();
        boolean s=true;
        while (s){
            int v = (int)((Math.random() * 50) * 2);
            if (v%2 == 0) {
                objects.add(v);
            }
            if (objects.size() == 10) {
                s=false;
            }
        }
        for (Object object : objects) {
            System.out.print(object+" ");
        }



    }
}
