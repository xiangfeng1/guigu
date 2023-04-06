package com.atguigu.io;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class TestPath {
    @Test
    public void test1(){
        File dir = new File("d:\\temp");//通过指定绝对路径来创建File对象
        System.out.println(dir.getPath());//构造路径
        System.out.println(dir.getAbsolutePath());//绝对路径
    }

    @Test
    public void test2(){
        File dir = new File("1.txt");//通过指定相对路径来创建File对象
        System.out.println(dir.getPath());//构造路径
        System.out.println(dir.getAbsolutePath());//绝对路径
        //D:\atguigu\javaee\JavaSE0308\code\JavaSE_Code\day0403_teacher_code\1.txt
    }

    public static void main(String[] args) {
        File dir = new File("2.txt");//通过指定相对路径来创建File对象
        System.out.println(dir.getPath());//构造路径
        System.out.println(dir.getAbsolutePath());//绝对路径
        //D:\atguigu\javaee\JavaSE0308\code\JavaSE_Code\2.txt
    }

    @Test
    public void test3() throws IOException {
        File dir = new File("../../../3.txt");//通过指定相对路径来创建File对象
        System.out.println(dir.getPath());//构造路径
        System.out.println(dir.getAbsolutePath());//绝对路径
        //D:\atguigu\javaee\JavaSE0308\code\JavaSE_Code\day0403_teacher_code\..\..\..\3.txt
        System.out.println(dir.getCanonicalPath());//规范路径
        //D:\atguigu\javaee\JavaSE0308\3.txt
    }
}
