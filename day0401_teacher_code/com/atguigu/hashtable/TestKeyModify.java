package com.atguigu.hashtable;

import org.junit.Test;

import java.util.HashMap;

public class TestKeyModify {
    @Test
    public void test1(){
        HashMap<Demo, String> map = new HashMap<>();
        Demo d1 = new Demo(1);
        Demo d2 = new Demo(2);
        Demo d3 = new Demo(3);

        map.put(d1, "atguigu");
        map.put(d2, "java");
        map.put(d3, "world");

        System.out.println(map);

        System.out.println("Demo(1)对应的value：" +map.get(d1));

        d1.setNum(100);

        System.out.println("Demo(1)对应的value：" +map.get(d1));
    }

    @Test
    public void test2(){
        HashMap<Demo, String> map = new HashMap<>();
        Demo d1 = new Demo(1);
        Demo d2 = new Demo(2);
        Demo d3 = new Demo(3);

        map.put(d1, "atguigu");
        map.put(d2, "java");
        map.put(d3, "world");

        System.out.println(map);

        System.out.println("Demo(1)对应的value：" +map.get(d1));

        d1.setNum(100);

        System.out.println("Demo(1)对应的value：" +map.get(d1));

        System.out.println(map);
    }
}
