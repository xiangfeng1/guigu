package Exer.Exer1;

public class Architect extends Designer{
    private double stock;

    @Override
    public String toString() {
        return super.getBasicInfo()+"\t\t架构师\t"+getBonus()+"\t"+stock;
    }

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, double bonus, double stock) {
        super(id, name, age, salary, bonus);
        this.stock = stock;
    }

    public double getStock() {
        return stock;
    }

    public void setStock(double stock) {
        this.stock = stock;
    }
}
