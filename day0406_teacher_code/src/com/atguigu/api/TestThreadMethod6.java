package com.atguigu.api;

public class TestThreadMethod6 {
    public static void main(String[] args) {
        PrintEvenThread even = new PrintEvenThread();
//        PrintOddThread odd = new PrintOddThread(even);
        PrintOddThread odd = new PrintOddThread();

        even.start();
        odd.start();

        //如果odd线程完事了，让even停下来
        try {
            odd.join();
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
        even.setFlag(false);
    }
}

class PrintEvenThread extends Thread{
    private boolean flag = true;
    @Override
    public void run() {
        for(int i=2; i<=100 && flag; i+=2){
            System.out.println("偶数：" + i);
            //要求每隔1毫秒打印1个偶数
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }
}

class PrintOddThread extends Thread{
    @Override
    public void run() {
        for(int i=1; i<=100; i+=2){
            System.out.println("奇数：" + i);
        }
    }
}
/*
class PrintOddThread extends Thread{
    private PrintEvenThread evenThread;

    public PrintOddThread(PrintEvenThread evenThread) {
        this.evenThread = evenThread;
    }

    @Override
    public void run() {
        for(int i=1; i<=100; i+=2){
            System.out.println("奇数：" + i);
        }
        evenThread.setFlag(false);
    }
}*/
