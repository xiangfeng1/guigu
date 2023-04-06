package com.zxf.Exer.Exer2;

import java.util.Scanner;

public class ExerTest {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (i == 5) {
                Thread thread = new Thread() {
                    @Override
                    public void run() {
                        Scanner input = new Scanner(System.in);
                        while (true) {
                            System.out.println("是否结束？");
                            String next = input.next();
                            if (next.compareToIgnoreCase("y") >= 0) {
                                break;
                            }
                        }
                    }
                };
                thread.start();

                try {
                    thread.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

