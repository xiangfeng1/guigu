package com.atguigu.link;

import org.junit.Test;

public class TestSingleLinkedList {
    @Test
    public void test1(){
        SingleLinkedList<String> list = new SingleLinkedList<>();
        list.add("hello");
        list.add("java");
        list.add("world");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
