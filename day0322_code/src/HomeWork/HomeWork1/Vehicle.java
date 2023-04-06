package HomeWork.HomeWork1;

public abstract class Vehicle {
    //轮子数量
    private int wheels;

    @Override
    public String toString() {
        return "轮子数量"+wheels;
    }

    public  abstract void drive();

    public Vehicle() {
    }

    public Vehicle(int wheels) {
        this.wheels = wheels;
    }
}
