package com.zxf.Exer.buffer;

import java.util.Comparator;

public class EmployeeAgeComparator implements Comparator<Employee> {

    @Override
    public int compare(Employee o1, Employee o2) {
            int temp=o1.getAge()- o2.getAge();

        if (temp == 0) {
            temp=o1.getName().compareTo(o2.getName());
        }
        if (temp==0){
            temp=o1.getId()-o2.getId();
        }
        return temp;
    }
}
