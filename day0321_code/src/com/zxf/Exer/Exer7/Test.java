package com.zxf.Exer.Exer7;
/*（1）父类Graphic图形

- public double area()方法：返回0.0
- public double perimeter()方法：返回0.0
- 重写toString()方法，返回图形面积和图形周长

（2）子类Circle圆继承Graphic图形

- 包含属性：radius，属性私有化
- 包含get/set方法
- 重写area()求面积方法
- 重写perimeter()求周长方法
- 重写toString()方法，返回圆的半径，面积和周长
（3）子类矩形Rectangle继承Graphic图形
- 包含属性：length、width，属性私有化
- 包含get/set方法
- 重写area()求面积方法
- 重写perimeter()求周长方法
- 重写toString()方法，返回长和宽，面积、周长信息

（4）在测试类的main方法中创建多个圆和矩形对象放到Graphic[]类型的数
     组中，并按照面积从小到大排序输出。*/
public class Test {
    public static void main(String[] args) {
        Graphic[] graphics = new Graphic[4];
        graphics[0]=new Circle(2);
        graphics[1]=new Circle(3.2);
        graphics[2]=new Rectangle(2,3);
        graphics[3]=new Rectangle(4,3);


        for (int i = 0; i <graphics.length ; i++) {
            System.out.println(graphics[i]);
        }


        for (int i = 0; i <graphics.length -1; i++) {
            for (int j = 0; j <graphics.length-1-i ; j++) {
                if (graphics[j].area()>graphics[j+1].area()) {
                    Graphic temp=graphics[j];
                    graphics[j]=graphics[j+1];
                    graphics[j+1]=temp;
                }
            }
        }
        System.out.println("排序后：");
        System.out.println("------------------------");
        for (int i = 0; i <graphics.length ; i++) {
            System.out.println(graphics[i]);
        }


    }
}
