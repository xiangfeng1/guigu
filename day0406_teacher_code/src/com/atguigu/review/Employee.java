package com.atguigu.review;

public class Employee extends Person{
    private Person person;

    public Employee(Person person) {
        this.person = person;
    }

    @Override
    public void say() {
        System.out.println("emplyee.say()");
        person.say();
    }
}
