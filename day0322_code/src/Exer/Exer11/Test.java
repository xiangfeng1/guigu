package Exer.Exer11;
/*（1）声明三角形类Triangle
- 属性：double类型的a,b,c，代表三角形的三条边，要求属性使用final声明，并且私有化
- 提供有参构造，并且在构造器中检查a,b,c是否可以构成三角形，如果a,b,c可以构成三角形
  则正常赋值，否则提示错误，并且a,b,c赋值为0
- 生成a,b,c的get方法
- public double area()方法：返回三角形面积（使用海伦公式）
- public double perimeter()方法：返回三角形周长

- 重写toString方法，并返回三角形信息，例如：“三角形三边是：3.0,4.0,5.0，
   面积是6.0，周长是：12.0”


（2）在测试类的main中创建三角形对象，a,b,c分为赋值为3,4,5，打印对象看结果。*/
public class Test {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3,4,5);
        System.out.println(triangle);
    }
}
