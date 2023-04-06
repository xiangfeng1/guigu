package com.zxf.test;

import com.zxf.util.Rectangle;
/*
* 1)声明Rectangle矩形类，包含长length、宽width属性，
* 声明求面积area方法和求周长perimeter方法，以及返回矩
* 形的长、宽、面积、周长值等信息的getInfo方法
（2）在测试类中，创建2个矩形对象，指定它们的长和宽，并调用方法进行测试。*/
public class Exercise16 {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle();
        rectangle1.width=5;
        rectangle1.length=6;

        rectangle2.width=2;
        rectangle2.length=1;
        System.out.println(rectangle1.area()+","+rectangle1.perimeter()+","+rectangle1.getInfo());
        System.out.println(rectangle2.area()+","+rectangle2.perimeter()+","+rectangle2.getInfo());

    }
}
