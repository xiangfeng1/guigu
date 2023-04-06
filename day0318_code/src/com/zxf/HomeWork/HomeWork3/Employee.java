package com.zxf.HomeWork.HomeWork3;

public class Employee {
    public int id;
    public String name;
    public double salary;
    public int age;

    public String getInfo(){
        return "员工的编号为："+id+"，姓名为："+name+"，薪资为："+salary+"，年龄为："+age;
    }
    public  void setInfo(int  id, String name, double salary, int age){
        this.id=id;
        this.name = name;
        this.salary = salary;
        this.age = age;
    }
}
