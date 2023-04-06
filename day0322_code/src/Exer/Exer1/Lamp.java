package Exer.Exer1;

public class Lamp extends Light{
    @Override
    void on() {
        System.out.println("台灯打开");
    }

    @Override
    void off() {
        System.out.println("台灯关闭");
    }
}
