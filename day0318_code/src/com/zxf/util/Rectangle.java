package com.zxf.util;
/*矩形类*/
public class Rectangle {
    public double length;
    public double width;

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return (width+length)*2;
    }

    public String getInfo(){
        return "矩形的长："+length+",矩形的宽为："+width+",矩形的面积为"+area()+",矩形的周长为:"+perimeter();
    }
}
