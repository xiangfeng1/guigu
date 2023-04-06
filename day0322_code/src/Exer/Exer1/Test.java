package Exer.Exer1;
/*### 1、交通灯
（1）声明抽象父类Light灯，包含抽象方法 void on()和void off()
（2）声明台灯Lamp，继承Light，重写on抽象方法：输出  台灯打开，灯常亮，
     重写off抽象方法：输出台灯关闭
（3）声明转向灯TurnSignal，继承继承Light，重写on抽象方法：输出 转向
      灯打开，闪烁亮，重写off抽象方法：输出转向灯关闭
（4）测试类，创建两个子类对象，并调用on和off方法。*/
public class Test {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        TurnSignal turnSignal = new TurnSignal();
        lamp.on();
        lamp.off();
        System.out.println("---------------------");
        turnSignal.on();
        turnSignal.off();
    }
}
