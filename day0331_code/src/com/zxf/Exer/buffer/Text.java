package com.zxf.Exer.buffer;

import java.util.Arrays;

public class Text {
    public static void main(String[] args) {
        Employee[] employee = new Employee[4];
        employee[0]=new Employee(1,"张三",18000,12);
        employee[1]=new Employee(2,"李四",15000,23);
        employee[2]=new Employee(3,"王五",18000,26);
        employee[3]=new Employee(4,"赵六",16200,28);

        System.out.println("排序前：");
        for (Employee employee1 : employee) {
            System.out.println(employee1);
        }
        Arrays.sort( employee);
        System.out.println("----------------------------");
        System.out.println("按照薪资排序后：");
        for (Employee employee1 : employee) {
            System.out.println(employee1);
        }
        System.out.println("----------------------------");
        System.out.println("按照年龄排序后：");
        Arrays.sort(employee,new EmployeeAgeComparator());
        for (Employee employee1 : employee) {
            System.out.println(employee1);
        }
    }
}
