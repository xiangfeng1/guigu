package com.zxf.HomeWork.HomeWork3;

public class EmployeeManager {
    public Employee[] allEmployees = new Employee[5];
    public int total;

    public boolean addEmployee(Employee emp) {
        if (total >= allEmployees.length) {
            System.out.println("数组已满");
            return false;
        }
        allEmployees[total++] = emp;
        return true;
    }

    public Employee[] getEmployees() {
        Employee[] results = new Employee[total];
        for (int i = 0; i < results.length; i++) {
            results[i] = allEmployees[i];
        }
        return results;
    }

}