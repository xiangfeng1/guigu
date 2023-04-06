package com.zxf.HomeWork.HomeWork3;

public class Test {
    public static void main(String[] args) {
        Integer[] arr=new Integer[]{1,2,3,4,5,6};
        MyArrays.method(arr,2,3);

        for (Integer integer : arr) {
            System.out.print(integer);
        }
    }
}
