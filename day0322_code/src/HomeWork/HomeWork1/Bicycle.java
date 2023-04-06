package HomeWork.HomeWork1;

public class Bicycle extends Vehicle{
    @Override
    public void drive() {
        System.out.println("脚踏双轮自行车，优哉游哉往前走");
    }

    public Bicycle() {
    }

    public Bicycle(int wheels) {
        super(wheels);
    }
}
