package com.zxf.Exer.Exer7;

public class Circle extends Graphic{
    private double radius;

    @Override
    public String toString() {
        return "半径"+radius+",面积"+area()+",周长"+perimeter();
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
