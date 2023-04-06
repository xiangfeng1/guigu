package com.zxf.HomeWork;

import java.io.File;
import java.io.IOException;

public class HomeWork2 {
    public static void main(String[] args) throws IOException {
        File file = new File("D://testIO/a.txt");

            boolean exists = file.exists();
            if (exists == true) {
                System.out.println("找到了");
            }else {
                System.out.println("沒找到");
                file.createNewFile();
            }
        }

    }