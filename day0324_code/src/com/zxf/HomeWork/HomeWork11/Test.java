package com.zxf.HomeWork.HomeWork11;

import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        EmployeeService p = new EmployeeService();
        p.add(new Employee(1,"李四",24,24000));
        p.add(new Employee(2,"张三",23,22000));
        p.add(new Employee(3,"王五",25,2240));
        p.add(new Employee(4,"赵六",24,26200));
        p.add(new Employee(5,"钱七",25,2200));

        System.out.println("所有员工：");
        Employee[] all=p.get(new Predicate() {
            @Override
            public boolean test(Object o) {
                return true;
            }
        });
        ArrayTools.print(all);
        System.out.println("--------------------------------");
        System.out.println("所有年龄超过25且薪资高于15000的员工：");
        all = p.get(new Predicate() {
            @Override
            public boolean test(Object o) {
                Employee e = (Employee) o;
                return e.getAge()>20 && e.getSalary()>15000;
            }
        });
        ArrayTools.print(all);


    }
}
