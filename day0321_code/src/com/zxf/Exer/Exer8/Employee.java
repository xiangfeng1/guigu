package com.zxf.Exer.Exer8;

public class Employee {
    private String name;

    public  double earning(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "姓名："+name+"\t实发工资："+earning();
    }

    public Employee() {
    }

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
