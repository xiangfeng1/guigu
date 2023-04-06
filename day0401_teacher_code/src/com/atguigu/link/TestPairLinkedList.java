package com.atguigu.link;

import org.junit.Test;

public class TestPairLinkedList {
    @Test
    public void test1(){
        PairLinkedList<String> list = new PairLinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("atguigu");

        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test2(){
        PairLinkedList<String> list = new PairLinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("atguigu");

        list.add(2,"haha");

        for (String s : list) {
            System.out.println(s);
        }
    }

    @Test
    public void test3(){
        PairLinkedList<String> list = new PairLinkedList<>();
        list.add(0,"hello");
        list.add(0,"world");
        list.add(1,"java");
        list.add(2,"atguigu");
        for (String s : list) {
            System.out.println(s);
        }
    }


    @Test
    public void test4(){
        PairLinkedList<String> list = new PairLinkedList<>();
        list.add("hello");
        list.add("world");
        list.add("java");
        list.add("atguigu");

        list.remove("world");
        list.remove("hello");
        list.remove("atguigu");

        for (String s : list) {
            System.out.println(s);
        }
    }
}
