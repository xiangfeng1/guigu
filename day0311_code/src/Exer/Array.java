package Exer;

import java.util.Scanner;
/*数组反转*/
public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] a = {1,3,4,5,6};
        System.out.println("反转前");
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b] + " ");
        }
        System.out.println();
        for (int i = 0; i < a.length / 2; i++) {
            int j = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = j;
        }
        System.out.println("------------------------------------------ ");
        System.out.println("反转后：");
        for (int b = 0; b < a.length; b++) {
            System.out.print(a[b] + " ");
        }
    }
}
