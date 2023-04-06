package com.zxf.HomeWork.HomeWork2;

public class Architect extends Designer{
    private double stock;

    @Override
    public String toString() {
        return super.toString()+"\t 股票"+stock;
    }

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, String position, double bonus, double stock) {
        super(id, name, age, salary, position, bonus);
        this.stock = stock;
    }
}
