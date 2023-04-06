package Exer;
import static Exer.ArraysTools.*;
public class Text8ArraysTool {
    public static void main(String[] args) {
        int[] arr1 = {5,4,2,17,3};
        System.out.print("排序前：");
        ArraysTools.toString(arr1);

        ArraysTools.sort(arr1);

        System.out.print("排序后：");
        ArraysTools.toString(arr1);
        System.out.println();


        double[] arr2 = {5.0 ,4.0, 2.0,17.0,3.0};
        System.out.print("排序前：");
        ArraysTools.toString(arr2);
        ArraysTools.sort(arr2);

        System.out.print("排序后：");
        ArraysTools.toString(arr2);
        System.out.println("");

        char[] arr3 = {'h','a','o','b','t'};
        System.out.print("排序前：");
        ArraysTools.toString(arr3);

        System.out.print("排序后：");
        ArraysTools.sort(arr3);
       ArraysTools.toString(arr3);

    }
}
