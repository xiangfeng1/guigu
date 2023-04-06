package Exer.Exer2;

public class Triangle extends Graphic {
    private  final double a;
    private final double b;
    private final double c;

    @Override
    public double area() {
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public double perimeter() {
        return a+b+c;
    }

    @Override
    public String toString() {
        return  "三角形三边是："+ a+ "," +b +"," + c +super.toString();
    }

    public Triangle(double a, double b, double c) {
        if (a>0&&b>0&&c>0&&a+b>c&&a+c>b&&b+c>a) {
            this.a = a;
            this.b = b;
            this.c = c;
        }else {
            this.a = 0;
            this.b = 0;
            this.c = 0;
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }
}
