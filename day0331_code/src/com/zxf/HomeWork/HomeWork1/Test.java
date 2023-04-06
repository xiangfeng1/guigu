package com.zxf.HomeWork.HomeWork1;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            objects.add(i);
        }
        for (int i = 65; i <90 ; i++) {
            objects.add((char)i);
        }
        for (int i = 97; i <123 ; i++) {
            objects.add((char)i);
        }

        ArrayList<Object> objects1 = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            String str="";
            for (int j = 0; j <6 ; j++) {
               str+= objects.get((int) (Math.random() * 61));
            }
            objects1.add(str);
        }


        Iterator<Object> iterator = objects1.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
