package com.zxf.HomeWork.HomeWork1;

public class Man extends Person {
    @Override
    public void eat() {
        System.out.println(getName()+"狼吞虎咽吃饭");
    }
    public void smaoke(){
        System.out.println(getName()+"抽烟");
    }

    public Man(String name, int age, String job) {
        super(name, age, job);
    }

    public Man() {
    }
}
