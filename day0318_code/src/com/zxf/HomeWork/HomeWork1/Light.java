package com.zxf.HomeWork.HomeWork1;

public class Light {
    public String color;
   public  int time;

    public  String getInfo( ){
        if (color.equals("绿灯")) {
            return color+time+"秒";
        } else if (color.equals("红色")) {
            return color+time+"秒";
        }else {
            return color+time+"秒";
        }
    }

}
