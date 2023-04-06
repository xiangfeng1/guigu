package com.atguigu.thread;

public class TestMyRunnable {
    public static void main(String[] args) {
        MyRunnable my = new MyRunnable();
//        my.run();//错误

        Thread t = new Thread(my);
        t.start();

        System.out.println("----------------");
        //在main中打印1-100的奇数
        for(int i=1; i<=100; i+=2){
            System.out.println("main线程：" + i);
        }
    }
}
