package HomeWork.HomeWork1;

public class Monnocycle extends Vehicle {
    @Override
    public void drive() {
        System.out.println("脚踏独轮车，摇摇摆摆往前走");
    }

    public Monnocycle(int wheels) {
        super(wheels);
    }

    public Monnocycle() {

    }
}
