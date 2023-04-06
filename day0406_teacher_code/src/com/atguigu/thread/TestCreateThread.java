package com.atguigu.thread;

import org.junit.Test;

public class TestCreateThread {
    public static void main(String[] args) {
        //匿名内部类继承Thread类
        new Thread(){
            @Override
            public void run() {
                for(int i=2; i<=1000; i+=2){
                    System.out.println("自定义线程偶数：" + i);
                }
            }
        }.start();

        //匿名内部类实现Runnable接口
        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1; i<=1000; i+=2){
                    System.out.println("自定义线程奇数：" + i);
                }
            }
        }).start();

        //这里有几个线程：3个
    }

    //测试多线程代码，不要用JUnit，使用main线程测试
    @Test
    public void test(){
        //匿名内部类继承Thread类
        new Thread(){
            @Override
            public void run() {
                for(int i=2; i<=1000; i+=2){
                    System.out.println("自定义线程偶数：" + i);
                }
            }
        }.start();

        //匿名内部类实现Runnable接口
        new Thread(new Runnable(){
            @Override
            public void run() {
                for(int i=1; i<=1000; i+=2){
                    System.out.println("自定义线程奇数：" + i);
                }
            }
        }).start();
    }
}
