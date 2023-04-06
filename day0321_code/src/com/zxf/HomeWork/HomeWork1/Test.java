package com.zxf.HomeWork.HomeWork1;

public class Test {
    public static void main(String[] args) {
        Person[]  peoples=new Person[4];
        peoples[0]=new Man("张三",25,"Java工程师");
        peoples[1]=new Man("李四",26,"摸鱼小王子");
        peoples[2]=new Woman("王五",28,"老黄牛");
        peoples[3]=new Woman("老刘",27,"菜鸟");
        System.out.println("-------自我介绍---------------------");
        for (int i = 0; i < peoples.length ; i++) {
            System.out.println(peoples[i]);
        }
        System.out.println("---------吃饭-------------------------");

        for (int i = 0; i < peoples.length; i++) {
            peoples[i].eat();
        }
        System.out.println("--------上厕所------------------------------");
        for (int i = 0; i < peoples.length; i++) {
            peoples[i].toilet();
            if (peoples[i] instanceof Man) {
                ((Man) peoples[i]).smaoke();
            }else if(peoples[i] instanceof Woman){
                ((Woman) peoples[i]).makeup();
            }
        }

    }
}
