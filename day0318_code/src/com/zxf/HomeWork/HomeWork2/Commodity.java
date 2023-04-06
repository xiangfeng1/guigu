package com.zxf.HomeWork.HomeWork2;

public class Commodity {
    public String id;
    public String title;
    public double price;
    public int stock;

    public String getInfo(){
        return "编号：" + id +"，名称：" + title +"，价格：" + price +"，库存：" + stock;
    }

}
