package Exer.Exer13;
/*（1）声明一个图形父类Graphic，包含
- public double area()：返回0.0
- public double perimeter()：返回0.0
- public String toString()：返回“面积：xxx，周长：xxx”
（2）子类Circle圆继承Graphic图形
- 包含属性：radius，属性私有化
- 包含get/set方法
- 重写area()求面积方法
- 重写perimeter()求周长方法
- 重写toString()方法，返回圆的半径，面积和周长
（3）声明一个矩形Rectangle，继承Graphic父类
- 属性：长和宽，私有化
- 提供get/set
- 提供无参构造和有参构造
- 重写area()和perimeter方法，
- 重写toString方法，返回“长：xx，宽：xx，面积：xxx，周长：xxx”
（4）声明一个三角形Triangle，继承Graphic父
- 属性：a,b,c分别代表三角形的三边，私有化
- 提供get/set
- 提供有参构造，public Triangle(double a, double b, double c)，并验证a,b,c的值是否可以构成三角形，如果可以构成三角形再为a,b,c的属性赋值
- 重写area()和perimeter方法，
- 重写toString方法，返回“边长：xx,xx,xx，面积：xxx，周长：xxx”
（5）声明图形工具类GraphicTools
- 提供静态方法public static int compare(Graphic s1, Graphic s2)如果s1的面积大于、小于、等于s2的面积，分别返回正整数、符整数和0。
- 提供静态方法public static boolean equals(Graphics1, Graphics2)比较两个图形的面积和周长是否都相等
- 提供静态方法public static void sort(Graphic[] arr)可以给所有图形按照面积从小到大排序，如果面积相同的按照周长从小到大排序
- 提供静态方法public static void print(Graphic[] arr)可以遍历输出所有图形信息
（6）在测试类中，
- 创建1个矩形（3,6），创建1个三角形t1(3,4,5），创建1个圆形(2.0)
- 调用compare方法比较矩形和三角形的面积大小，
- 调用equals方法比较矩形和三角形的面积和周长，
- 创建Graphic数组中，把上面3个对象放到数组中，调用就sort方法排序，在排序前后调用print方法遍历显示信息*/
public class Test {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,6);
        Triangle t = new Triangle(3,4,5);
        Circle c = new Circle(2.0);


        int result = GraphicTools.compare(r,t);
        if(result == 0){
            System.out.println("r1和t1的面积相等");
        }else if(result>0){
            System.out.println("r1的面积大于t1的面积");
        }else{
            System.out.println("r1的面积小于t1的面积");
        }

        System.out.println("r2和t2的面积和周长是否都相等？" + GraphicTools.compare(r,t));

        Graphic[] arr = new Graphic[3];
        arr[0] = r;
        arr[1] = t;
        arr[2] = c;


        System.out.println("排序前：");
        GraphicTools.print(arr);
        GraphicTools.sort(arr);
        System.out.println("排序后：");
        GraphicTools.print(arr);
    }
}
