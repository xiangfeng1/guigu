package com.zxf.Exer.Exer1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Predicate;


public class Exer1 {
    public static void main(String[] args) {
        Collection<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("java");
        list.add("world");
        list.add("atguigu");
        list.add("love");
        list.add("you");
        list.add("mom");
        list.add("dad");
        list.add("noon");
        for (String s : list) {
            System.out.print(s+" ");
        }

        list.removeIf(new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return new StringBuilder(s).reverse().toString().equals(s);
            }
        });

        System.out.println("删除回文单词后：");
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String s=iterator.next();
            System.out.println(s+"=>"+s.length());
        }


    }
}
