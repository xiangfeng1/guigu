package HomeWork.HomeWork2;

public class Chicken extends Bird implements Flyable{
    @Override
    public void eat() {
        System.out.println("鸡吃谷子");
    }

    @Override
    public void fly() {
        System.out.println("鸡上房揭瓦，满院子乱扑腾");
    }
}
