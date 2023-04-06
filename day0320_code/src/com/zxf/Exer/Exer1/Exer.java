package com.zxf.Exer.Exer1;

public class Exer {
    private double length;
    private  double width;


    //按照面积排序
    public static void AreaSort(Exer[] exers){
        for (int i = 0; i < exers.length-1 ; i++) {
            for (int j = 0; j < exers.length-1-i; j++) {
                if (exers[j].area()>exers[j+1].area()) {
                    Exer temp=exers[j];
                    exers[j]=exers[j+1];
                    exers[j+1]=temp;
                }
            }
        }
    }

    //按照长度排序
    public static void sort(Exer[] exers){
        for (int i = 0; i < exers.length-1 ; i++) {
            for (int j = 0; j < exers.length-1-i; j++) {
                if (exers[j].length>exers[j+1].length) {
                    Exer temp=exers[j];
                    exers[j]=exers[j+1];
                    exers[j+1]=temp;
                }
            }
        }
    }

    //遍历循环
    public  static void a(Exer[] exers){
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
