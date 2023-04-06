package Exer.Exer12;
/*### 银行账户类
（1）声明一个银行账户类Account，
- 成员变量：利率、账号、余额，其中所有账户的利率是相同的，所有成员变量都私有化。
- 提供get/set
- 提供有参构造public Account(String id ,double balance)
- 提供计算年利息方法public double annualInterest()，余额*利率
- 重写toString方法，返回账号和余额、年利息
（2）在测试类的main中，创建账户类的两个对象，账号分别为“11111”和“22222”
    ，余额分别为“1000和2000”元，利率初始值是0.035，调用方法测试。*/
public class Test12 {
    public static void main(String[] args) {
        Account account = new Account("11111",1000);
        Account account1 = new Account("22222",2000);
        Account.setLilv(0.035);
        System.out.println(account);
        System.out.println(account1);
    }
}
