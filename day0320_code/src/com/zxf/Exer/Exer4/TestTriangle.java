package com.zxf.Exer.Exer4;
/*在练习题2的基础上，声明构造器。*/
public class TestTriangle {
    public static void main(String[] args) {
        Triangle a1 = new Triangle();
        a1.setBases(3,4,5);
        System.out.println(a1.getInfo());
       Triangle t=  new Triangle(2,4,6);
        System.out.println(t.getInfo());

    }
}
