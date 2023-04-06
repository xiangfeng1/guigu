package com.zxf.Exer.Exer2;

public class Exer2 {
    public static void main(String[] args) {
       new Thread( new Runnable(){
            @Override
            public void run() {
                for (int i = 0; i <=100 ; i+=2) {
                    System.out.println("Runnable:"+i);
                }
            }
        }).start();


       new Thread(){
           @Override
           public void run() {
               for (int i = 0; i <=100 ; i+=1) {
                   System.out.println("Thread:"+i);
               }
           }
       }.start();
    }
}
