package com.zxf.Exer.Exer8;

public class HourEmployee extends Employee{
    private double moneyPerHour;
    private double hour;

    @Override
    public double earning() {
        return moneyPerHour*hour;
    }

    @Override
    public String toString() {
        return "姓名:"+getName()+"\t实发工资"+earning()+"\t时薪"+moneyPerHour+"\t工作小时"+hour;
    }

    public HourEmployee(String name, double moneyPerHour, double hour) {
        super(name);
        this.moneyPerHour = moneyPerHour;
        this.hour = hour;
    }

    public HourEmployee(String name, double moneyPerHour) {
        super(name);
        this.moneyPerHour = moneyPerHour;
    }
}
