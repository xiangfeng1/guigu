package com.atguigu.api;

public class TestThreadMethod1 {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);//让当前线程休眠1000毫秒再继续
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("继续");
    }
}
