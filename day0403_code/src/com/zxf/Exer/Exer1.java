package com.zxf.Exer;

import java.io.File;

public class Exer1 {
    public static void main(String[] args) {
        File file = new File("D:\\a");
        System.out.println(getLength(file));

    }

    public static long getLength(File dir) {
        if (dir != null && dir.isDirectory()) {
            File[] files = dir.listFiles();
            if (files != null) {
                long sum = 0;
                for (File file : files) {
                    sum += getLength(file);
                }
                return sum;
            }
        } else if (dir != null && dir.isFile()) {
            return dir.length();
        }
        return 0;
    }
}
