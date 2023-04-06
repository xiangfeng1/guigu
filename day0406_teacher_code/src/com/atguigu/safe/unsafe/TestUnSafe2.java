package com.atguigu.safe.unsafe;

public class TestUnSafe2 {
    public static void main(String[] args) {
        TicketRunnable runnable = new TicketRunnable();

        Thread t1 = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);

        t1.start();
        t2.start();
        t3.start();
    }
}

class TicketRunnable implements Runnable{//实现接口
    private int total = 10;//实例变量

    @Override
    public void run() {
        while(total>0){
            total--;
            System.out.println(Thread.currentThread().getName()+"卖出1张票，剩余：" + total);
        }
    }
}