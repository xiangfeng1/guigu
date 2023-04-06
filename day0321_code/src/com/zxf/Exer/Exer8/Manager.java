package com.zxf.Exer.Exer8;

public class Manager extends SalaryEmployee {
    private double bonusRate;

    @Override
    public double earning() {
        return super.earning()*(1+bonusRate);
    }

    @Override
    public String toString() {
        return super.toString()+"、奖金比例"+bonusRate;
    }

    public Manager(String name, double salary, int year, int month, int day, double bonusRate) {
        super(name, salary, year, month, day);
        this.bonusRate = bonusRate;
    }

    public Manager(String name, double salary, MyDate birthday, double bonusRate) {
        super(name, salary, birthday);
        this.bonusRate = bonusRate;
    }

    public double getBonusRate() {
        return bonusRate;
    }

    public void setBonusRate(double bonusRate) {
        this.bonusRate = bonusRate;
    }
}
