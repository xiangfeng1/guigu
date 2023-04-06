package Exer.Exer1;

public class Designer extends Programmer {
    //奖金
    private double bonus;

    @Override
    public String toString() {
        return super.getBasicInfo()+"\t\t设计师\t\t"+bonus;
    }

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, double bonus) {
        super(id, name, age, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
