package com.atguigu.api;

public class TestThreadMethod3 {
    public static void main(String[] args) {
/*        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.NORM_PRIORITY);//5*/

        ThreadDemo t = new ThreadDemo();
//        t.setPriority(1000);//java.lang.IllegalArgumentException(非法参数错误）
        t.setPriority(Thread.MAX_PRIORITY);
        t.start();

        ThreadExample e = new ThreadExample();
        e.setPriority(Thread.MIN_PRIORITY);
        e.start();


        /*Thread.currentThread().setPriority(Thread.MIN_PRIORITY);
        for(int i=1; i<=100; i+=2){
            System.out.println("主方法中的："+Thread.currentThread().getName() + "线程偶数：" + i);
        }*/
    }
}
class ThreadDemo extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=100; i+=2){
            System.out.println(getName() + "线程奇数：" + i);
        }
    }
}
class ThreadExample extends Thread{
    @Override
    public void run() {
        for(int i=2; i<=100; i+=2){
            System.out.println(getName() + "线程偶数：" + i);
        }
    }
}