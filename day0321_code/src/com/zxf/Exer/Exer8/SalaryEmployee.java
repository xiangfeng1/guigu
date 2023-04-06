package com.zxf.Exer.Exer8;

public class SalaryEmployee extends Employee{
    private double salary;
    private MyDate  birthday;

    public SalaryEmployee() {
        super();
    }

    @Override
    public double earning() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString()+"\t生日："+birthday;
    }

    public SalaryEmployee(String name, double salary, int year, int month , int day) {
        super(name);
        this.salary = salary;
        this.birthday = new MyDate(year,month,day);
    }

    public SalaryEmployee(String name, double salary, MyDate birthday) {
        super(name);
        this.salary = salary;
        this.birthday = birthday;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public MyDate getbirthday() {
        return  birthday;
    }

    public void setbirthday(MyDate date) {
        this. birthday =  birthday;
    }
}
