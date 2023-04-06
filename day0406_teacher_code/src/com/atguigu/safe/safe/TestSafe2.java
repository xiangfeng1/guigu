package com.atguigu.safe.safe;

public class TestSafe2 {
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
    private int total = 1000;//实例变量

    //run方法是非静态方法，默认锁对象是this
    //这里TicketRunnable类的对象只有1个，同一个锁对象
    //锁的范围太大了
    @Override
    public  void run() {
        while(total>0){
            saleOneTicket();
        }
    }

    public synchronized void saleOneTicket(){
        if(total>0){
            total--;
            System.out.println(Thread.currentThread().getName()+"卖出1张票，剩余：" + total);
        }
    }
}
/*
class TicketRunnable implements Runnable{//实现接口
    private int total = 1000;//实例变量

    //run方法是非静态方法，默认锁对象是this
    //这里TicketRunnable类的对象只有1个，同一个锁对象
    //锁的范围太大了
    @Override
    public synchronized void run() {
        while(total>0){
            total--;
            System.out.println(Thread.currentThread().getName()+"卖出1张票，剩余：" + total);
        }
    }
}*/
