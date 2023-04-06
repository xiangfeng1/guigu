package com.atguigu.io;

import org.junit.Test;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.Date;

public class TestFile {
    @Test
    public void test1(){
        //File(String pathname)
        File file = new File("D:\\temp\\19.jpg");
        System.out.println(file);
        System.out.println("文件名：" + file.getName());
        System.out.println("文件的大小：" + file.length());//单位字节
        System.out.println("文件的最后修改时间：" + file.lastModified());//单位毫秒

        long time = file.lastModified();
        Date d = new Date(time);
        System.out.println("文件的最后修改时间：" + d);

        System.out.println("判断文件是否存在：" + file.exists());
        System.out.println("判断该file对象是否是文件：" + file.isFile());
        System.out.println("判断该file对象是否是目录：" + file.isDirectory());
        System.out.println("该文件是否可读：" + file.canRead());
        System.out.println("该文件是否可写：" + file.canWrite());
        System.out.println("该文件是否是隐藏文件：" + file.isHidden());
    }

    @Test
    public void test2() throws IOException {
        File newFile = new File("d:\\temp\\chai.jpg");
        newFile.createNewFile();//权限，磁盘空间，路径不存在等，创建失败
    }

    @Test
    public void test3() throws IOException {
        File newDir = new File("d:\\temp\\java");
//        newDir.createNewFile();//创建文件
        newDir.mkdir();//创建java一级目录
    }

    @Test
    public void test4(){
        File newDir = new File("d:\\temp\\atguigu\\java\\io\\test");
        newDir.mkdirs();//创建test及其附目录
    }

    @Test
    public void test5() throws IOException {
        File file = new File("d:\\temp\\chai.jpg");
        file.delete();
    }

    @Test
    public void test6() throws IOException {
        File dir = new File("d:\\temp\\java");
        dir.delete();//只能删除空目录
    }

    @Test
    public void test7() throws IOException {
        File dir = new File("d:\\temp\\atguigu");
        dir.delete();//不能删除非空目录
    }

    @Test
    public void test8(){
        File dir = new File("d:\\temp\\atguigu");
        String parent = dir.getParent();
        System.out.println(parent);
    }

    @Test
    public void test9(){
        File file = new File("d:\\temp\\chai.jpg");
        System.out.println(file.getParent());
    }

    @Test
    public void test10(){
        File dir = new File("d:\\temp");
        String[] strings = dir.list();
        for (String s : strings) {
            System.out.println(s);//继续对s进行操作，只能调用String的方法
        }
        System.out.println("---------------");
        File[] files = dir.listFiles();
        for (File f : files) {
            System.out.println(f);//继续对f进行操作，可以调用File的方法
        }
    }

    @Test
    public void test11(){
        File dir = new File("d:\\temp");
        /*
        public File[] listFiles(FileFilter filter) 方法的形参是FileFilter类型
        FileFilter是一个接口，包含抽象方法 public boolean accept(File pathname)
         */
        File[] files = dir.listFiles(new FileFilter() {
            @Override
            public boolean accept(File subFile) {
                //只筛选出 文件是".jpg"的文件
                return subFile.isFile() && subFile.getName().toLowerCase().endsWith(".jpg");
            }
        });
        for (File f : files) {
            System.out.println(f);//继续对f进行操作，可以调用File的方法
        }
    }



}
