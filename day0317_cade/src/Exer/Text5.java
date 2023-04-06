package Exer;

public class Text5 {
    //n个整数中的最小值
    static int min(int...nums){
        int min=nums[0];
        for (int i = 1; i < nums.length ; i++) {
            if(nums[i]<min){
                min=nums[i];
            }
        }
        return min;
    }
    //返回n个整数的最大公约数
    static int maxApproximate(int...nums) {
        int min = min(nums);
        for (int i = min; i >= 1; i--) {
            boolean a = true;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] % i != 0) {
                    a = false;
                    break;
                }
            }
            if (a == true) {
                return i;}
        }
        return 1;
    }

    public static void main(String[] args) {
        int []nums={5,4,9,6};
        System.out.println(min(nums));
        int []nums2={50,15,30,100};
        System.out.println(maxApproximate(nums2));



    }

}
