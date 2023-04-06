package com.zxf.Exer.Exer4;

public class Triangle {
    private double a;
    private double b;
    private double c;


    public Triangle() {
    }

    public Triangle(double a, double b, double c) {
        setBases(a,b,c);
    }

    //返回三角形的三条边，面积和周长
    public String getInfo(){
        if (setBases(a,b,c)) {
            return "三角形的三条边分别是："+"a:"+a+",b:"+b+",c:"+c+",面积是："+area()+",周长："+perimeter();
        }
        return "不是三角形";
    }

    //三角形周长
    public double perimeter(){
        return (a+b+c)*2;
    }

    //三角形面积
    public double area(){
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    //判断是不是三角形
    public boolean setBases(double a,double b,double c){
        if (a>=0&&b>=0&&c>=0&&a+b>c&&a+c>b&&b+c>a) {
            this.a=a;
            this.b=b;
            this.c=c;
        }else {
            return false;
        }
        return true;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

}
