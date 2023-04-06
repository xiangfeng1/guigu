package com.zxf.Exer.buffer;

public class Employee {
    private int id;
    private String name ;
    private double seary;

    public  Employee(int id, String name, double seary) {
        this.id = id;
        this.name = name;
        this.seary = seary;
    }

    @Override
    public String toString() {
        return "id=" + id + ", name='" + name + '\'' + ", seary=" + seary;
    }

    public Employee() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSeary() {
        return seary;
    }

    public void setSeary(double seary) {
        this.seary = seary;
    }
}
