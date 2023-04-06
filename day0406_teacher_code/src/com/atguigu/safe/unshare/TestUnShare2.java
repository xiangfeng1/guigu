package com.atguigu.safe.unshare;

public class TestUnShare2 {
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
    private int total = 10;//实例变量

    @Override
    public void run() {
        while(total>0){
            total--;
            System.out.println(getName()+"卖出1张票，剩余：" + total);
        }
    }
}
