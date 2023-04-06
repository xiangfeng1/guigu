package Exer;
/*随机产生10个[0,100)之间整数放到一维数组中，然后遍历所有随机数，
并统计随机数中偶数的个数、3的倍数的个数。*/
public class TestArray6 {
    public static void main(String[] args) {
        int[] nums=new int[10];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=(int)(Math.random()*100);
            System.out.print(nums[i]+" ");
        }
        System.out.println();
        int a=0;
        int b=0;
        int c=0;
        int d=0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]%2==0&&nums[i]%3==0) {
                a++;
                System.out.println(nums[i]+"\t2和3的倍数");
            } else if (nums[i]%2==0) {
                b++;
                System.out.println(nums[i]+"\t2的倍数");
            } else if (nums[i]%3==0) {
                c++;
                System.out.println(nums[i]+"\t3的倍数");
            }else {
                d++;
            }
        }

        System.out.println("是2和3的倍数的个数是："+a);
        System.out.println("是偶数的个数是："+(b+a));
        System.out.println("是3的倍数的个数是："+(c+a));
        System.out.println("都不是的个数是："+d);
    }
}
