package Exer.Exer1;

import static Exer.Exer1.Data.*;

public class Test {
    public static void main(String[] args) {
        Employee[] arr = new Employee[EMPLOYEES.length];
        for (int i = 0; i < arr.length; i++) {
            int type = Integer.parseInt(EMPLOYEES[i][0]);
            int id = Integer.parseInt(EMPLOYEES[i][1]);
            String name = EMPLOYEES[i][2];
            int age = Integer.parseInt(EMPLOYEES[i][3]);
            double salary = Double.parseDouble(EMPLOYEES[i][4]);

            switch (type){
                case EMPLOYEE:
                    arr[i] = new Employee(id,name,age,salary);break;
                case PROGRAMMER:
                    arr[i] = new Programmer(id,name,age,salary);break;
                case DESIGNER:
                    double bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    arr[i] = new Designer(id,name,age,salary,bonus);break;
                case ARCHITECT:
                    bonus = Double.parseDouble(EMPLOYEES[i][5]);
                    int stock = Integer.parseInt(EMPLOYEES[i][6]);
                    arr[i] = new Architect(id,name,age,salary,bonus,stock);break;
            }
            System.out.println(arr[i]);
        }
    }
}
