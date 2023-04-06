package com.zxf.HomeWork.HomeWork4;

public class Test {
    public static void main(String[] args) {
        Integer[] integers= {1,2,3,4,5};
        System.out.println("反转前：");
        for (Integer integer : integers) {
            System.out.print(integer+(integer<5?"、":""));
        }
        MyArrays.reverse(integers);

        System.out.println("\n反转后：");
        for (Integer integer : integers) {
            System.out.print(integer+(integer>1?"、":""));
        }
    }
}
