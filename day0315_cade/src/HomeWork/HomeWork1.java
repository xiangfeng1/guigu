package HomeWork;
/*案例需求：随机产生10个[1,100]之间的偶数存储到数组中，并按照从小到大排序输出。
开发提示：
- 随机产生[1,50]范围内的整数 * 2 就能得到[1,100]之间的偶数*/
public class HomeWork1 {
    public static void main(String[] args) {
        int [] nums=new int[10];
        for (int i = 0; i <nums.length ; i++) {
            nums[i]=(int)((Math.random()*50+1))*2;
        }
        for (int i = 0; i <nums.length-1 ; i++) {
            for (int j = 0; j <nums.length-1 ; j++) {
                if (nums[j] >nums[j+1]) {
                    int temp=nums[j];
                    nums[j]=nums[j+1];
                    nums[j+1]=temp;
                }
            }
            }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
        }


    }
