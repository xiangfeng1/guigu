package com.atguigu.review;

import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestObjectIO {
    @Test
    public void test()throws IOException {
        Student s = new Student("张三",100);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.aaa"));
        oos.writeObject(s);
        oos.close();
    }

    @Test
    public void test2()throws IOException {
        Student s = new Student("张三",100,new Teacher());
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("stu.aaa"));
        oos.writeObject(s);
        oos.close();
    }
}
