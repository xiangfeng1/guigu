package com.zxf.Exer.buffer;

import org.junit.Test;

import java.io.*;

public class TestBufferedInputAndOutputStream {
    //复制
    @Test
    public void test1() throws IOException {
        FileInputStream fis = new FileInputStream("E://IoTest/a.txt");
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream("E://IoTest/a_副本.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] data = new byte[10];
        int len;
        while((len = bis.read(data)) != -1){
            bos.write(data,0,len);

        }
        bos.close();
        fos.close();
        bis.close();
        fis.close();
    }

    @Test
    public void test2() throws IOException {
        FileReader fr = new FileReader("intest/atguigu.txt");
        BufferedReader br = new BufferedReader(fr);

        FileWriter fw = new FileWriter("intest/atguigu_副本.txt");
        BufferedWriter bw = new BufferedWriter(fw);

        String line;
        while((line=br.readLine())!=null){
            bw.write(line);
            bw.newLine();
        }

    }







}
