package com.atguigu.review;

import java.io.Serializable;

public class Student extends Person implements Serializable {
    private String name;
    private int score;

    private Person teacher;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }

    public Student(String name, int score, Person teacher) {
        this.name = name;
        this.score = score;
        this.teacher = teacher;
    }

    public Student(Person teacher) {
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Person getTeacher() {
        return teacher;
    }

    public void setTeacher(Person teacher) {
        this.teacher = teacher;
    }

    public void say(){
        System.out.println("student.say()");
        teacher.say();
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                ", teacher=" + teacher +
                '}';
    }
}
