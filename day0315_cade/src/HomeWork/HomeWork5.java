package HomeWork;

public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = {2,6,2,5,7,1,2,5,6,1,5,6,1,6,5,7,1};
        int [] a=new int[arr.length];
        int num =0;
        for (int i = 0; i < arr.length ; i++) {
            num= num^ arr[i];
        }
        System.out.println(num);
    }
}

