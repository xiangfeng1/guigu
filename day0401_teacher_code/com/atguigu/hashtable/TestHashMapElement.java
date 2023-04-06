package com.atguigu.hashtable;

import org.junit.Test;

import java.util.HashMap;

public class TestHashMapElement {
    @Test
    public void test1(){
        HashMap<String, String> map = new HashMap<>();
        //存储咱们班同学及其对象名
        map.put("张辰旭","丁琪");
        map.put("马民印","武凌飞");
        map.put("李世杰",null);

    }
}
