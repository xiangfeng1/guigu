package com.atguigu.thread;

public class TestMyThread {
    public static void main(String[] args) {
        MyThread my = new MyThread();
//        my.run();//手动调用run，线性执行，先执行完my.run()，才能执行下面的输出1-100的奇数
        my.start();

        //在main中打印1-100的奇数
        for(int i=1; i<=100; i+=2){
            System.out.println("main线程：" + i);
        }
    }
}
