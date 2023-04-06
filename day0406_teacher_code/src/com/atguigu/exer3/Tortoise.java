package com.atguigu.exer3;

public class Tortoise extends Thread{
    private long time;
    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for(int i=1; i<=30; i++){
            //1米每秒
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("乌龟跑了" + i + "米");

            if(i==10 || i==20){
                System.out.println("乌龟开始休息，休息1秒....");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        long end = System.currentTimeMillis();
        time = end - start;
        System.out.println("乌龟达到终点..");
    }
    public long getTime() {
        return time;
    }
}
