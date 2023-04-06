package Exer.Exer12;

public class Account {
    private static double lilv;
    private String id;
    private double balance;//余额

    @Override
    public String toString() {
        return "账号为："+id+"，余额："+balance+"，年利息："+annuallInterest();
    }

    public double annuallInterest(){
        return balance*lilv;
    }


    public Account(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public static double getLilv() {
        return lilv;
    }

    public static void setLilv(double lilv) {
        Account.lilv = lilv;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
