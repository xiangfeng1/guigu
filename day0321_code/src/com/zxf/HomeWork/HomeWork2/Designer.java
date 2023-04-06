package com.zxf.HomeWork.HomeWork2;

public class Designer extends Programmer {
    private double bonus;

    @Override
    public String toString() {
        return super.toString()+"\t奖金"+bonus;
    }

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, String position, double bonus) {
        super(id, name, age, salary, position);
        this.bonus = bonus;
    }
}
