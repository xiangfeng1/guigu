package com.atguigu.api;

public class TestThreadMethod8 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                for(int i=2; i<=200 ; i+=2){
                    System.out.println("偶数：" + i);
                }
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };
        t.start();


        MyDaemon my = new MyDaemon();
        my.setDaemon(true);//让my线程称为守护线程的角色
        my.start();

    }
}
class MyDaemon extends Thread{
    @Override
    public void run() {
        while(true){
            System.out.println("我默默的守护你，不独活于世界!!!");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}