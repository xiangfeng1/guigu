package com.zxf.Exer.Exer5;

public class Teacher extends Person{
    private double salary;

    @Override
    public String toString() {
         return "姓名：" + getName() + ", 年龄：" + getAge() + ", 性别：" + getGender()+"，薪资为"+salary;
    }

    public Teacher(String name, int age, char gender,double salary) {
        super(name, age, gender);
        this.salary=salary;
    }

    public Teacher() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
