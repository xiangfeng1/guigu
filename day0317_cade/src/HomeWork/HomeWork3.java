package HomeWork;

public class HomeWork3 {
    //求所有数组的和
    static int sum(int[] arr){
        int sum=arr[0];
        for (int i = 1; i < arr.length ; i++) {
            sum+=arr[i];
        }
        return sum;
    }
    //求所有元素的最大值
    static int max(int[] arr){
        int max=arr[0];
        for (int i = 1; i <arr.length ; i++) {
            if ( arr[i]>max ) {
                max=arr[i];
            }
        }
        return max;
    }

    //

}
