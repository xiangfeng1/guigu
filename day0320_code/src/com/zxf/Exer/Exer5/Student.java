package com.zxf.Exer.Exer5;

public class Student extends Person {
    private double score;

    @Override
    public String toString() {
        return "姓名：" + getName() + ", 年龄：" + getAge() + ", 性别：" + getGender()+"，分数为"+score;
    }

    public Student(String name, int age, char gender,double score) {
        super(name, age, gender);
        this.score = score;
    }

    public Student() {
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
