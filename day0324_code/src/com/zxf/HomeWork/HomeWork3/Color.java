package com.zxf.HomeWork.HomeWork3;

/*（1）声明颜色枚举类Color：

- 声明final修饰的int类型的属性red,green,blue
- 声明final修饰的String类型的属性description
- 声明有参构造Color(int red, int green, int blue
,String description)
- 创建7个常量对象：赤、橙、黄、绿、青、蓝、紫，
- 重写toString方法，例如：RED(255,0,0)->红色

（2）在测试类中，使用枚举类，获取绿色对象，并打印对象。

提示：

- 7个常量对象的RGB值如下：*/
public enum Color {
    RED(255,0,0,"赤"),
    ORANGE(255,128,0,"橙"),
    YELLOW(255,225,0,"黄"),
    GREEN(0,225,0,"绿"),
    CYAN(0,225,225,"青"),
    BLUE(0,0,225,"蓝"),
    PURPLE(128,0,255,"紫");

    private final int red,green,blue;
    private final String description;


    Color(int red, int green, int blue, String description) {
        this.red = red;
        this.green = green;
        this.blue = blue;
        this.description = description;
    }

    @Override
    public String toString() {
        return name()+"("+red+","+green+","+green+")->"+description;
    }
}
