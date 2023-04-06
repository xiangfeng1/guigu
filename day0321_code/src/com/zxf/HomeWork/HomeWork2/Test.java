package com.zxf.HomeWork.HomeWork2;

public class Test {
    public static void main(String[] args) {
        Employee[] peoples=new Employee[4];
        peoples[0]=new Employee(1,"张三",23,6000);
        peoples[1]=new Programmer(2,"李四",23,6000,"程序员");
        peoples[2]=new Designer(3,"张三",23,6000,"设计师",3000);
        peoples[3]=new Architect(4,"张三",23,6000,"架构师",5000,3000);

        for (int i = 0; i < peoples.length; i++) {
            System.out.println(peoples[i].toString());
        }

    }

}
