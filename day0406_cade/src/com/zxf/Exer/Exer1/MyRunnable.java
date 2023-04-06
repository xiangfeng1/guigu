package com.zxf.Exer.Exer1;

public class MyRunnable implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i+=2) {
            System.out.println("Runnable:"+i);
        }
    }
}
