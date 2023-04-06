package com.zxf.Exer.Exer8;

import java.util.Scanner;
/*（1）声明一个父类Employee员工类型，

- 有姓名属性，私有化，提供get/set方法
- 提供有参构造public Employee(String name)
- public double earning()：代表实发工资，返回0.0
- 重写public String toString()：显示姓名和实发工资

（2）声明MyDate类型

- 有int类型的年，月，日属性，私有化，提供get/set方法
- 提供有参构造public MyDate(int year, int month, int day)
- 重写public String toString()，返回“xxxx年xx月xx日”

（3）声明一个子类SalaryEmployee正式工，继承父类Employee

- 增加属性，double类型的薪资，MyDate类型的出生日期，私有化，提供get/set方法
- 提供有参构造public SalaryEmployee(String name, double salary,  MyDate birthday)
- 提供有参构造public SalaryEmployee(String name,double salary,  int year, int month ,int day)
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资
- 重写public String toString()：显示姓名和实发工资、生日

（4）声明一个子类HourEmployee小时工，继承父类Employee

- 有属性，double类型的工作小时数和每小时多少钱
- 提供有参构造public HourEmployee(String name, double moneyPerHour)
- 提供有参构造public HourEmployee(String name, double moneyPerHour, double hour)
- 重写方法，public double earning()返回实发工资， 实发工资 = 每小时多少钱 * 小时数
- 重写public String toString()：显示姓名和实发工资，时薪，工作小时数

（5）声明一个子类Manager经理，继承SalaryEmployee

- 增加属性：奖金比例，私有化，提供get/set方法
- 提供有参构造public Manager(String name, double salary, MyDate birthday, double bonusRate)
- 提供有参构造public Manager(String name,double salary,  int year, int month ,
   int day, double bonusRate)
- 重写方法，public double earning()返回实发工资， 实发工资 = 薪资 *(1+奖金比例)
- 重写public String toString()：显示姓名和实发工资，生日，奖金比例
（6）声明一个员工数组，存储各种员工，你现在是人事，遍历查看每个人的详细信息，并统计实发工资总额，
     通知财务准备资金。
（7）从键盘输入当期月份值，如果他是正式工（包括SalaryEmployee和Manager），并且是本月生日的，
    通知领取生日礼物。*/
public class Test {
    public static void main(String[] args) {
        Employee[] all = new Employee[3];
        all[0] = new SalaryEmployee("张三",15000,new MyDate(1995,5,1));
        all[1] = new HourEmployee("李四",50,100);
        all[2]=new Manager("王老五",50000,1989,5,15,0.3);

        double sum=0;
        for (int i = 0; i < all.length; i++) {
            System.out.println(all[i]);
               sum +=all[i].earning();
        }
        System.out.println("本月共发："+sum);

        Scanner input = new Scanner(System.in);
        System.out.println("请输入月份：");
        int month= input.nextInt();

        for (int i = 0; i < all.length; i++) {
            if (all[i] instanceof SalaryEmployee) {
                SalaryEmployee s=(SalaryEmployee) all[i];
                if (s.getbirthday().getMonth() == month) {
                    System.out.println(s.getName()+"生日快乐，请到人事部门领取生日大礼包");
                }
            }
        }
    }
}
