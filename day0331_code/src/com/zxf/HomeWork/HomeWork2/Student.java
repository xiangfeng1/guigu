package com.zxf.HomeWork.HomeWork2;

public class Student  {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "name='" + name + ", age=" + age ;
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String find(Student s){
        if (s.age>25) {
            return s.getName();
        }

        return null;
    }


}
