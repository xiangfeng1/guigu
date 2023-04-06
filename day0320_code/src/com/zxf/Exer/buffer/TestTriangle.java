package com.zxf.Exer.buffer;
/*（1）定义三角形类Triangle，

- 声明实例变量a,b,c，代表三角形三条边，全部私有化private，
- 提供每条边的get方法，
- 提供public void setBases(double a, double b, double c)：
  要求参数a,b,c的值必须大于等于0，且满足三角形三边关系要求（即任意两边之后大于第三边）
   ，否则提示错误信息
- 声明public double area()，返回三角形面积
- 声明public double perimeter()：返回三角形周长
- 声明public String getInfo()：返回三角形的三条边，面积和周长

（2）测试类的main中创建一个三角形对象，并调用相应方法*/
public class TestTriangle {
    public static void main(String[] args) {
        Triangle a1 = new Triangle();

        System.out.println(a1.getInfo(3,4,5));

    }
}
