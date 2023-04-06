package com.atguigu.review;

public class TestEmployee {
    public static void main(String[] args) {
        Employee e = new Employee(new Student(new Teacher()));
        e.say();

        System.out.println("-------------");
        Employee e2 = new Employee(new Teacher());
        e2.say();

        try {
            Thread.sleep(5000);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
