package com.atguigu.safe.unshare;

public class TestUnShare {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();

        w1.start();
        w2.start();
        w3.start();
    }
}

class Window extends Thread{

    @Override
    public void run() {
        int total = 10;//局部变量
        while(total>0){
            total--;
            System.out.println(getName()+"卖出1张票，剩余：" + total);
        }
    }
}
