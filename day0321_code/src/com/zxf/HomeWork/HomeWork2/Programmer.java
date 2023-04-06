package com.zxf.HomeWork.HomeWork2;

public class Programmer extends Employee{
    private String position;//职位

    @Override
    public String toString() {
        return super.toString()+"，职位："+position;
    }

    public Programmer(int id, String name, int age, double salary, String position) {
        super(id, name, age, salary);
        this.position = position;
    }

    public Programmer() {
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
