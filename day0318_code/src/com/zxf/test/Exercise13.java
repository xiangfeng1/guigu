package com.zxf.test;

import com.zxf.util.Circle;

public class Exercise13 {
    public static void main(String[] args) {
        Circle r = new Circle();
        double PI=3.14;
        r.radius=2.1;
        double r1= r.radius;
        double s=PI*r1*r1;
        System.out.println("面积是："+s);

    }
}
