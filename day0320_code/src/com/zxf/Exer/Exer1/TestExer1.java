package com.zxf.Exer.Exer1;
/*矩形类
（1）定义矩形类Rectangle，
- 声明实例变量长和宽，全部私有化private，
- 提供相应的get/set方法，如果set方法的参数值<=0，则提示矩形的长和宽必须是正数
- 声明public double area()，返回矩形面积
- 声明public double perimeter()：返回矩形的周长
- 声明public String getInfo()：返回矩形的长、宽、面积、周长信息

（2）测试类的main中创建一个可以装3个矩形对象的数组，并调用set方法为对象
     的属性赋值，依次长是8,7,6，宽是2,3,4
- 遍历输出矩形对象数组
- 按照矩形对象的length属性值从小到大排序后，遍历输出矩形对象数组
- 按照矩形对象的面积从小到大排序后，遍历输出矩形对象数组*/
public class TestExer1 {
    public static void main(String[] args) {
        Exer[] exer = new Exer[3];

        //循环给数组添加值
        for (int i = 0; i < exer.length; i++) {
             exer[i]=new Exer();
            exer[i].setLength(8-i);
            exer[i].setWidth(i+2);
        }

        System.out.println("排序前：");
        //遍历数组
        Exer.a(exer);
        System.out.println("---------------------------");
        System.out.println("按照长度排序后：");
        //按照长度排序
        Exer.sort(exer);
        Exer.a(exer);
        System.out.println("---------------------------");
        System.out.println("按照面积从小到大排序后：");
        //按照面积排序
        Exer.AreaSort(exer);
        Exer.a(exer);

    }

}
