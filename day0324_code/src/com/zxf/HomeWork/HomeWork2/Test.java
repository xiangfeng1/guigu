package com.zxf.HomeWork.HomeWork2;
/*（1）已知java.lang包下有一个Thread类==（这个类不用写）==，该类有：
- ①public Thread(String name)构造器
- ②public Thread(Runnable target)构造器
- ③public void run()方法
- ④public void start()方法
- ⑤public String getName()方法
（2）已知java.lang包下还有一个Runnable接口==（这个接口不用写）==，该接口有
- 抽象方法：public void run()
案例需求：

（1）请用匿名内部类的方式继承Thread类，并显示使用Thread(String name)构造器，
    传入实参“自己的姓名”，在匿名内部类中重写run方法，输出“xx爱尚硅谷”，其中xx
    通过getName()方法获取。同时调用Thread类匿名子类对象的start()方法。

（2）请用Thread(Runnable target)构造器创建Thread类的对象，并且用匿名内部类的
方式实现Runnable接口，重写run方法，输出“尚硅谷爱我”。调用Thread类对象的start方法

（3）运行测试类，查看运行效果*/
public class Test {
    public static void main(String[] args) {
        new Thread("张祥丰"){
            @Override
            public void run() {
                System.out.println(getName()+"爱尚硅谷");
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("尚硅谷爱我");
            }
        }).start();

    }
}
