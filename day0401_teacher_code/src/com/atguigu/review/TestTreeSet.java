package com.atguigu.review;

import java.util.TreeSet;

public class TestTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();
        set.add(5);
        set.add(3);
        set.add(1);
        set.add(10);
        set.add(7);

        System.out.println(set);
    }
}
