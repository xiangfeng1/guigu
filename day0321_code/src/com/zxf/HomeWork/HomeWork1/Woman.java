package com.zxf.HomeWork.HomeWork1;

public class Woman extends Person {
    @Override
    public void eat() {
        System.out.println(getName()+"细嚼慢咽吃饭");
    }
    public void makeup(){
        System.out.println(getName()+"化妆");
    }


    public Woman() {
    }

    public Woman(String name, int age, String job) {
        super(name, age, job);
    }
}
