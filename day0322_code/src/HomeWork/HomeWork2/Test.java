package HomeWork.HomeWork2;

public class Test {
    public static void main(String[] args) {
        Bird[] birds = new Bird[3];
        birds[0] = new Penguin();
        birds[1] = new Swan();
        birds[2] = new Chicken();

        for (int i = 0; i < birds.length; i++) {
            birds[i].eat();
            if(birds[i] instanceof Flyable){
                Flyable f = (Flyable) birds[i];
                f.fly();
            }
            if(birds[i] instanceof Swimming){
                Swimming s = (Swimming)birds[i];
                s.swim();
            }
            System.out.println("-------------------");
        }
    }
}