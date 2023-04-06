package com.zxf.Exer.Exer3;

public class Exer3 {
    private double length;
    private  double width;


    public Exer3() {
    }

    public Exer3(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //按照面积排序
    public static void AreaSort(Exer3[] exers){
        for (int i = 0; i < exers.length-1 ; i++) {
            for (int j = 0; j < exers.length-1-i; j++) {
                if (exers[j].area()>exers[j+1].area()) {
                    Exer3 temp=exers[j];
                    exers[j]=exers[j+1];
                    exers[j+1]=temp;
                }
            }
        }
    }

    //按照长度排序
    public static void sort(Exer3[] exers){
        for (int i = 0; i < exers.length-1 ; i++) {
            for (int j = 0; j < exers.length-1-i; j++) {
                if (exers[j].length>exers[j+1].length) {
                    Exer3 temp=exers[j];
                    exers[j]=exers[j+1];
                    exers[j+1]=temp;
                }
            }
        }
    }

    //遍历循环
    public  static void a(Exer3[] exers){
        for (int i = 0; i < exers.length ; i++) {
            System.out.println(exers[i].getInfo());
        }
    }

    //计算面积
    public double area(){
        return length*width;
    }

    //计算周长
    public double perimeter(){
        return (length+width)*2;
    }

    //打印信息
    public String getInfo(){
        return "矩形的长为："+length+"，宽为："+width+"，面积为："+area()+",周长为："+ perimeter();
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
