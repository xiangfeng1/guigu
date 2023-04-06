package com.atguigu.api;

public class TestThreadMethod4 {
    public static void main(String[] args) {
        Thread t = new Thread(){
            @Override
            public void run() {
                for(int i=1; i<=500; i+=2){
                    System.out.println(getName() + "线程奇数：" + i);
                }
            }
        };
        t.start();

        while(true){
            if(t.isAlive()){
                System.out.println("t线程还活着");
            }else{
                System.out.println("t线程已经停止");
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
