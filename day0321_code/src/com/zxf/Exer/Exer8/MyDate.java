package com.zxf.Exer.Exer8;

public class MyDate {
    private int year;
    private int month;
    private int date;


    @Override
    public String toString() {
        return year+"年"+month+"月"+date+"日";
    }

    public MyDate() {
    }

    public MyDate(int year, int month, int date) {
        this.year = year;
        this.month = month;
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }
}
