package com.atguigu.io;

import org.junit.Test;

import java.io.File;

public class TestFileTools {
    @Test
    public void test1(){
        File dir = new File("d:\\Download - 副本");
        FileTools.forceDir(dir);
    }

    @Test
    public void test2(){
        File dir = new File("d:\\download");
//        System.out.println(dir.length());//12288(错误）
        System.out.println(FileTools.getDirectoryLength(dir));//3019093998
    }
}


