package com.zxf.HomeWork.HomeWork1;
/*声明Light交通灯类，包含颜色color和时间time属性，
    包含getInfo方法，返回xx颜色的灯亮xx秒。
  创建3个交通灯对象，分别红色60秒，绿色90秒，黄色3秒。*/
public class Demo {
    public static void main(String[] args) {
        Light light1 = new Light();
        light1.color="红灯";
        light1.time=60;
        System.out.println(light1.getInfo());
    }
}
