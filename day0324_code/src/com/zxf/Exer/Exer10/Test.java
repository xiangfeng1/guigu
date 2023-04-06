package com.zxf.Exer.Exer10;

import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        MyArrayList list = new MyArrayList();
        list.add("hello");
        list.add("java");
        list.add("world");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
