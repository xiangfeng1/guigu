package com.atguigu.api;

public class TestThreadMethod2 {
    public static void main(String[] args) {
        MyThread m1 = new MyThread();
        m1.start();

        MyThread m2 = new MyThread();
        m2.start();

        MyThread m3 = new MyThread();
        m3.setName("尚硅谷牌线程");
        m3.start();

        System.out.println(Thread.currentThread().getName()+"线程对象名");
        //这个语句一定是main方法执行，因为它在main方法体中

        MyRunnable runnable = new MyRunnable();
        Thread t = new Thread(runnable);
        t.start();
    }
}

class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println(getName()+"在执行...");
    }
}

class MyRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"在执行****");
    }
}