package com.zxf.HomeWork.HomeWork3;

public class MyArrays {
    public static <T> void method(T[] arr, int a, int b){
        T temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
}
