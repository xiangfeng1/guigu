package com.zxf.util;

public class MyInt {
   public int value;

   public boolean isNatural(){
       return value>=0?true:false;
   }


   public int approximateNumberCount(){
       int num=0;
       for (int i = value; i >=1 ; i--) {
           if (value %i== 0) {
               num+=1;
           }
       }
       return num;
   }


   public boolean isPrimeNumber(){
       return value>1&&approximateNumberCount()==2;
   }

   public int[] getAllPrimeNumber(){
       int[] arr=new int[approximateNumberCount()];
       for (int i = 1,j=0; i <=value ; i++) {
           if (value %i== 0) {
               arr[j++]=i;
           }
       }
       return arr;
   }
}
