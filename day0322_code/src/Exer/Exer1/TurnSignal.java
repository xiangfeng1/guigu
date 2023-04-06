package Exer.Exer1;

public class TurnSignal extends Light{
    @Override
    void on() {
        System.out.println("转向灯闪烁");
    }

    @Override
    void off() {
        System.out.println("转向灯关闭");

    }
}
