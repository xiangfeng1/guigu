package Exer;
/*数组反转*/
public class Test17ArrayReverse {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        System.out.println("反转前：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length/2; i++) {
            int c=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=c;
        }
        System.out.println("--------------------");
        System.out.println("反转后：");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

    }
}
