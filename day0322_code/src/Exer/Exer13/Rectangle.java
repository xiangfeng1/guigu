package Exer.Exer13;


public class Rectangle extends Graphic{
    private double Length;
    private double width;

    @Override
    public double area() {
        return Length*width;
    }

    @Override
    public double perimeter() {
        return 2*(Length+width);
    }

    @Override
    public String toString() {
        return "长方形的长为："+Length+",宽为："+width+super.toString();
    }

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        Length = length;
        this.width = width;
    }

    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
