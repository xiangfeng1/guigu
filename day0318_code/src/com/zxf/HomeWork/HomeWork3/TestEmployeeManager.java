package com.zxf.HomeWork.HomeWork3;

public class TestEmployeeManager {
    public static void main(String[] args) {
        EmployeeManager em = new EmployeeManager();

        Employee e1 = new Employee();
        e1.setInfo(1,"xiangfeng1",11520,21);
        Employee e2 = new Employee();
        e2.setInfo(2,"xiangfeng2",15295,22);
        Employee e3 = new Employee();
        e3.setInfo(3,"xiangfeng3",11221,23);
        Employee e4 = new Employee();
        e4.setInfo(4,"xiangfeng4",12536,24);
        Employee e5 = new Employee();
        e5.setInfo(5,"xiangfeng5",12423,25);
        Employee e6 = new Employee();
        e6.setInfo(6,"xiangfeng6",12545,26);

        System.out.println("添加e1" + (em.addEmployee(e1)?"成功":"失败"));
        System.out.println("添加e2" + (em.addEmployee(e2)?"成功":"失败"));
        System.out.println("添加e3" + (em.addEmployee(e3)?"成功":"失败"));
        System.out.println("添加e4" + (em.addEmployee(e4)?"成功":"失败"));
        System.out.println("添加e5" + (em.addEmployee(e5)?"成功":"失败"));
        System.out.println("添加e6" + (em.addEmployee(e6)?"成功":"失败"));

        Employee[] employees = em.getEmployees();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getInfo());
        }
    }
}