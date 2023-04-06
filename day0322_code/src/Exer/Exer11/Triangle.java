package Exer.Exer11;

import java.lang.reflect.Parameter;

public class Triangle {
     private final double a;
     private final double b;
    private final double c;

    @Override
    public String toString() {
        if(a==0&&b==0&&c==0){
            return "不能构成三角形";
        }else{
        return "三角形三边分别为"+a+","+b+","+c+"面积为："+area()+"周长为："+perimeter();
    }
    }

    //周长
    public double perimeter(){
        return a+b+c;
    }

    //用海伦公式求面积
    public double area(){
        double p=(a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public Triangle() {

        this.a = 0;
        this.b = 0;
        this.c = 0;
    }

    public  Triangle(double a, double b, double c) {
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
