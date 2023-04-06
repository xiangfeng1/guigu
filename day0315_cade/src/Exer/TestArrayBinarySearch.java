package Exer;

import java.util.Scanner;

/*二分查找*/
public class TestArrayBinarySearch {
    public static void main(String[] args) {
        int [] arr={22,22,25,46,55,66};
        Scanner input = new Scanner(System.in);

        System.out.print("请输入你要查找的值：");
        int num = input.nextInt();

        int left=0;
        int right=arr.length-1;
        int index=-1;
        while (right>=left) {
            int mid=(right+left)/2;
            if (arr[mid]==num) {
                index=mid;
                System.out.println(index);
                break;
            }else if(num>arr[mid]){
                left=mid+1;
            }else {
                right=mid-1;
            }
        }
        if (index!=-1) {
            System.out.print("找到了!!!\t"+"下标是:");
            for (int i = 0; i <arr.length ; i++) {
                if (arr[i] ==arr[index] ) {
                    System.out.print(i+"、");
                }
            }
        }else {
            System.out.println("没找到");
        }



    }
}
