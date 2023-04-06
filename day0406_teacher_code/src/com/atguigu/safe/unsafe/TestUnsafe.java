package com.atguigu.safe.unsafe;

public class TestUnsafe {
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
    private static int total = 10;//静态变量

    @Override
    public void run() {
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
}