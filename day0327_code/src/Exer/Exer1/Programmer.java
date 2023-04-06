package Exer.Exer1;

public class Programmer extends Employee{

    @Override
    public String toString() {
        return super.getBasicInfo()+"\t\t"+"程序员";
    }

    public Programmer() {
    }
    public Programmer(int id, String name, int age, double salary) {
        super(id, name, age, salary);
    }
}
