package com.zxf.Exer.buffer;

public class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private double seary;
    private int age;



    @Override
    public String toString()  {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", seary=" + seary +
                ", age=" + age +
                '}';
    }

    public Employee() {
    }

    public Employee(int id, String name, double seary, int age) {
        this.id = id;
        this.name = name;
        this.seary = seary;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Employee o) {
        int result=Double.compare(this.seary,o.seary);
        if (result == 0) {
            result=this.name.compareTo(o.name);
        }
        if (result == 0) {
            result=this.id-id;
        }
        return result;
    }
}
