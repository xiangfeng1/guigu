package com.atguigu.api;

public class TestThreadMethod5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for(int i=2; i<=30; i+=2){
                    System.out.println("偶数：" + i);
                    //要求每隔1秒打印1个偶数
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            @Override
            public void run() {
                for(int i=1; i<=100; i+=2){
                    System.out.println("奇数：" + i);
                    if(i==5){
//                        Thread.yield();
                        try {
//                            t1.join();
                            /*
                            当前线程是t2线程，被加塞，被阻塞
                            t1加入进来，t1先执行
                             */
                            t1.join(10*1000);
                            /*
                            当前线程是t2线程，被加塞，被阻塞
                            t1加入进来，t1先执行10秒，然后t1,t2再一起
                             */
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
        t2.start();
    }
}
