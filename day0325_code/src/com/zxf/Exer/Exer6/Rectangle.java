package com.zxf.Exer.Exer6;

public class Rectangle implements Cloneable {
    private double length;
    private double width;

    @Override
    public  Rectangle clone() throws CloneNotSupportedException {
            return (Rectangle) super.clone();
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "lemgth=" + length +
                ", width=" + width +
                '}';
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLength(double lemgth) {
        this.length = lemgth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
