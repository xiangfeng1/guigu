package com.atguigu.safe.safe;

public class TestSafe1 {
    public static void main(String[] args) {
        TicketWindow t1 = new TicketWindow();
        TicketWindow t2 = new TicketWindow();
        TicketWindow t3 = new TicketWindow();

        t1.start();
        t2.start();
        t3.start();
    }
}
class TicketWindow extends Thread{
    private static int total = 1000;//静态变量

    @Override
    public void run() {
        while (total>0) {//锁的范围太小了
            saleOneTicket();
        }
    }

    public synchronized static void saleOneTicket() {
        if (total > 0) {
     /*       try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            total--;
            System.out.println(Thread.currentThread().getName() + "卖出1张票，剩余：" + total);
        }
    }
}
/*class TicketWindow extends Thread{
    private static int total = 100;//静态变量

    @Override
    public void run() {
        while (total>0) {//锁的范围太小了
            saleOneTicket();
        }
    }

    public synchronized static void saleOneTicket(){
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        total--;
        System.out.println(Thread.currentThread().getName()+"卖出1张票，剩余：" + total);
    }
}*/
/*class TicketWindow extends Thread{
    private static int total = 10;//静态变量


    @Override
    public  void run() {
        saleOneTicket();
    }


//    saleOneTicket()方法是静态方法，默认的锁对象是TicketWindow类的Class对象。
//    每一个类被加载到内存中之后，JVM都会用一个Class对象来表示这个类。
//    只要是同一个类，Class就只有一个。
    //锁的范围太大了

    public synchronized static void saleOneTicket(){
        while(total>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            total--;
            System.out.println(Thread.currentThread().getName()+"卖出1张票，剩余：" + total);
        }
    }
}*/
/*
class TicketWindow extends Thread{
    private static int total = 10;//静态变量


//    run()方法是非静态方法，默认锁对象是this，
//    这里三个TicketWindow的this对象不是同一个

    @Override
    public synchronized void run() {
        while(total>0){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            total--;
            System.out.println(getName()+"卖出1张票，剩余：" + total);
        }
    }
}*/
