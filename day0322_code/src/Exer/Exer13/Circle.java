package Exer.Exer13;

public class Circle extends Graphic{
    public double radius;


    @Override
    public String toString() {
        return "圆的半径为："+radius+","+super.toString();
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
