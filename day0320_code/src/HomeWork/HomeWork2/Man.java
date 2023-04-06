package HomeWork.HomeWork2;

public class Man extends Person {

    @Override
    public  void eat(){
        System.out.println(getName() + "狼吞虎咽吃饭");
    }
    public void smoke(){
        System.out.println(getName()+"抽烟");
    }
}
