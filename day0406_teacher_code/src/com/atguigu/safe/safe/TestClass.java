package com.atguigu.safe.safe;

public class TestClass {
    public static void main(String[] args) {
        Class c1 = String.class;//获取String类在内存中的Class
        Class c2 = "hello".getClass();//获取"hello"的类型对象
        System.out.println(c1 == c2);//true
    }
}
