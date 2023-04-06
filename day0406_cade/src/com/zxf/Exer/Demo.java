package com.zxf.Exer;

public class Demo {
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
        private static int total = 1000;

        @Override
        public void run() {
            while (total>0){
                saleOneTicket();
            }
        }

       public synchronized  static void saleOneTicket(){
           if (total>0) {
               total--;
               System.out.println(Thread.currentThread().getName() + "卖出1张票，剩余：" + total);
           }
       }
    }
