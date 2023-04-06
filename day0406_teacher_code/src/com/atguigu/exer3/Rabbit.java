package com.atguigu.exer3;

public class Rabbit extends Thread{
    private long time;

    @Override
    public void run() {
        long start = System.currentTimeMillis();

        for(int i=1; i<=30; i++){
            //10米每秒  1米0.1秒,100毫秒
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("兔子跑了" + i + "米");

            if(i==10 || i==20){
                System.out.println("兔子开始休息，休息10秒....");
                try {
                    Thread.sleep(10000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

        long end = System.currentTimeMillis();
        time = end-start;
        System.out.println("兔子达到终点..");
    }

    public long getTime() {
        return time;
    }
}
