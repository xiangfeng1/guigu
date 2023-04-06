package Exer;

public class TestBubbleSort {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
            int lun=0;
        for (int i = 0; i < arr.length-1; i++) {
            lun++;
                boolean flag=true;
            for (int j = 0; j <arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]) {
                    int num=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=num;
                    flag=false;
                }
            }
            if (flag) {
                break;
            }
        }
        System.out.println("轮数为："+lun);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
