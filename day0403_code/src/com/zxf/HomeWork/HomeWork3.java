package com.zxf.HomeWork;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class HomeWork3 {
    @Test
    public void test01() throws IOException {
        File file = new File("D://testIO/a.txt");
        //判断testIO里面是否有a.txt,如果没有则创建
        file.createNewFile();
    }

    @Test
    public void Test02() {
        File file = new File("D://testIO/a.txt");
        //获取文件的名字名，文件大小，文件的绝对路径，和父类路径等信息
        if (file.exists()) {
            System.out.println(file.getName() + " " + file.length() + " " + file.getAbsolutePath() + " " + file.getParent());
        }
    }
    //判断判断File file = new File("d:\testIO")
    // ;是不是文件是文件则输出：xxx是一个文件，是否文件夹,是文件夹则输出：xxx是一个文件夹
    @Test
    public void Test03(){
        File file = new File("d://testIO");

    }

}

