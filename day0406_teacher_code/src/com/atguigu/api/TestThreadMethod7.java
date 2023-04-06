package com.atguigu.api;

public class TestThreadMethod7 {
    public static void main(String[] args) {
        Thread t1 = new Thread(){
            @Override
            public void run() {
                for(int i=2; i<=100; i+=2){
                    System.out.println("偶数：" + i);
                    //要求每隔1毫秒打印1个偶数
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        t1.start();

        Thread t2 = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i += 2) {
                    System.out.println("奇数：" + i);
                }
            }
        };
        t2.start();

        try {
            t2.join();
            /*
            被阻塞的线程是main线程
            加入的线程是odd线程
            main线程让odd线程先执行，注意，此时和even无关。
            即odd和even是并列关系。

            main线程要等odd完全结束之后，下面的代码才能走
             */
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t1.interrupt();//中断，会发生意外
    }


}
