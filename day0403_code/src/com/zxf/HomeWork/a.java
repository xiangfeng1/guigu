package com.zxf.HomeWork;

import java.util.Arrays;

class a{
    public static void main(String[] args) {
        int[] objects = new int[]{5,7,3,9,2};
        int[] arr=new int[]{5,7,3,9,2};
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]) {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }

        Arrays.sort(objects);

        for (int i : arr) {
            System.out.print(i);
        }
        System.out.println();
        for (int object : objects) {
            System.out.print(object);
        }
    }
}

