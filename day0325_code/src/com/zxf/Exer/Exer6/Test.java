package com.zxf.Exer.Exer6;

public class Test {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,1);
        System.out.println(rectangle);
        Rectangle rectangle2 ;
        try {
            rectangle2=rectangle.clone();
        } catch (CloneNotSupportedException e) {
             rectangle2 = new Rectangle(rectangle.getLength(),rectangle.getWidth());
            System.out.println(rectangle2);
            e.printStackTrace();
        }
        System.out.println(rectangle2);
    }
}
