package com.atguigu.exer3;

public class Exercise3 {
    public static void main(String[] args) {
      /*  Rabbit rabbit = new Rabbit();
        Tortoise tortoise = new Tortoise();*/

        Runner rabbit = new Runner("兔子",100,10000);
        Runner tortoise = new Runner("乌龟",1000,1000);

        rabbit.start();
        tortoise.start();

        /*try {
            rabbit.join();//rabbit把main线程阻塞了
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        try {
            tortoise.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/

        while(true){
            if(!rabbit.isAlive() && !tortoise.isAlive()){
                break;
            }
        }


        long rabbitTime = rabbit.getTime();
        long tortoiseTime = tortoise.getTime();
        System.out.println("rabbitTime = " + rabbitTime);
        System.out.println("tortoiseTime = " + tortoiseTime);
        if(rabbitTime == tortoiseTime){
            System.out.println("平局");
        }else if(rabbitTime < tortoiseTime){
            System.out.println("兔子赢");
        }else{
            System.out.println("乌龟赢");
        }
    }
}
