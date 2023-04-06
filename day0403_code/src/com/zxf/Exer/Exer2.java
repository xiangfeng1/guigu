package com.zxf.Exer;

import java.io.File;

public class Exer2 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        forceDeleteDir(file);
    }
    public static void forceDeleteDir(File a){
        if (a != null&& a.isDirectory()) {
            File[] files = a.listFiles();
            if (files != null) {
                for (File file : files) {
                    forceDeleteDir(file);
                }
            }
        }
            a.delete();

    }
}

