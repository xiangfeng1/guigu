package com.atguigu.thread;

public class MyThread extends Thread{
    @Override
    public void run() {
        //该线程的对象要完成打印1-100的偶数
        for(int i=2; i<=100; i+=2){
            System.out.println("自定义线程：" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
