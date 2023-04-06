package com.zxf.HomeWork.HomeWork4;

public class MyArrays {
    public static <T> void reverse(T[] arr){
        for (int i = 0; i < arr.length/2 ; i++) {
            T temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
    }
}
