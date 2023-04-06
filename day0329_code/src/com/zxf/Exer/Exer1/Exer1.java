package com.zxf.Exer.Exer1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.logging.Filter;

public class Exer1 {
    public static void main(String[] args) {
        Collection nums = new ArrayList();

        for (int i = 0; i <10 ; i++) {
           nums.add((int)(Math.random()*100));
        }

        for (Object num : nums) {
            System.out.print(num+" ");
        }

        System.out.print("\n要删除的元素是：");
        Scanner input = new Scanner(System.in);
        int i = input.nextInt();
        nums.remove(i);

        for (Object num : nums) {
            System.out.print(num+" ");
        }


        nums.removeIf(new Predicate(){
            @Override
            public boolean test(Object o) {
                return (Integer) o%10==3;
            }
        });

        //删除以3结尾的数字
        System.out.println();
        for (Object num : nums) {
            System.out.print(num+" ");
        }







    }
}
