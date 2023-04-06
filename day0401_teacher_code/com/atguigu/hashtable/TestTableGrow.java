package com.atguigu.hashtable;

import java.util.HashMap;

public class TestTableGrow {
    public static void main(String[] args) {
        HashMap<Integer,String> map = new HashMap<>();
        for(int i=1; i<=15; i++){
            map.put(i, "value"+i);
        }
        System.out.println(map);
    }
}
