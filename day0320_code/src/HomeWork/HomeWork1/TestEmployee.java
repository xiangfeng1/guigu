package HomeWork.HomeWork1;

import java.util.Scanner;

public class TestEmployee {
    public static void main(String[] args) {
        Employee[] e = new Employee[1];
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < e.length; i++) {
            System.out.println("--------请输入第" + (i + 1) + "个员工");
            System.out.print("姓名：");
           String name= input.next();
            System.out.print("性别：");
            char gender=input.next().charAt(0);
            System.out.print("年龄：");
           int age= input.nextInt();
            System.out.print("薪资：");
            double salary=input.nextDouble();
            System.out.print("手机号：");
            String phone=input.next();
            System.out.print("email：");
            String email=input.next();

            Employee a = new Employee();
            a.setName(name);
            a.setGender(gender);
            a.setAge(age);
            a.setSalary(salary);
            a.setPhone(phone);
            a.setEmail(email);

            e[i]=a;
        }
        System.out.println("-------------添加完成-----------------");
        System.out.println("-------------员工列表-----------------");
        System.out.println("编号\t\t姓名\t性别\t年龄\t工资\t\t电话\t\t邮箱");
        for (int i = 0; i < e.length; i++) {
            System.out.println((i+1) + "\t\t" +e[i]);
        }
        System.out.println("-------------员工列表完成-----------------");
        input.close();

    }
}
