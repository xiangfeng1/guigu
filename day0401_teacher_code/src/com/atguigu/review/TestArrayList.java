package com.atguigu.review;

import java.util.ArrayList;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        //....
        list.add(0,"java");

        list.remove(0);

        list.remove("hello");

        list.indexOf("hello");

    }
}
