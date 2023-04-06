package com.zxf.HomeWork;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class HomeWork1 {
    @Test
    public  void Test01() throws IOException {
        File file = new File("D:/testIO");
        file.mkdir();
        File file1 = new File("D:/testIO/1.txt");
          file1.createNewFile();

    }
    @Test
    public void Test02() throws IOException {
        File file = new File("../testIO2");
        file.mkdir();
        File file1 = new File("../testIO2/1.txt");
        file1.createNewFile();
    }



}
