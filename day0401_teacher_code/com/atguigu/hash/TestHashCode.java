package com.atguigu.hash;

import org.junit.Test;

public class TestHashCode {
    @Test
    public void test1(){
        String str = "ab";
        System.out.println(str.hashCode());
        //3105
        //
    }

    @Test
    public void test2(){
        System.out.println("Aa".hashCode());//2112
        System.out.println("BB".hashCode());//2112
    }

}
