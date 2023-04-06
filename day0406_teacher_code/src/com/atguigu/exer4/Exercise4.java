package com.atguigu.exer4;



public class Exercise4 {
    public static void main(String[] args) {
        Runner rabbit = new Runner("兔子",100,10000);
        Runner tortoise = new Runner("乌龟",1000,1000);

        rabbit.start();
        tortoise.start();

        while(true){
            if(!rabbit.isAlive() || !tortoise.isAlive()){
                rabbit.interrupt();
                tortoise.interrupt();
                break;
            }
        }

        int rabbitDistance = rabbit.getDistance();
        int tortoiseDistance = tortoise.getDistance();
        System.out.println("rabbitDistance = " + rabbitDistance);
        System.out.println("tortoiseDistance = " + tortoiseDistance);

        if(rabbitDistance == tortoiseDistance ){
            System.out.println("平局");
        }else if(rabbitDistance > tortoiseDistance){
            System.out.println("兔子赢");
        }else{
            System.out.println("乌龟赢");
        }
    }
}
