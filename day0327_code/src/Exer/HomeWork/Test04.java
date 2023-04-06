package Exer.HomeWork;

import java.util.ArrayList;
import java.util.Arrays;

public class Test04 {
    public static void main(String[] args) {
        String[] arr = {"helloworld","java","chai","atguigu","lin","yan","I love you"};

        System.out.println("原字符串：");
        System.out.println( Arrays.toString(arr));

        int index=0;
        int length= arr.length;
        while(index<length){
            if(arr[index].length()>5){
                System.arraycopy(arr,index+1,arr,index,length-index-1);
                length--;
            }else {
                index++;
            }

        }
        System.out.println("删除后：");
        arr = Arrays.copyOf(arr, length);
        System.out.println(Arrays.toString(arr));
    }
}
