package HomeWork;
/*案例需求：判断数组中是否存在一个值，其左侧的值累加加和等于
其右侧的值累加和，如果存在，找出这个值，如果不存在就显示不存在。

例如：[1,2,5,3,2,4,2]，结果为：平衡数是3，因为3左边的1,2,5
累加和是8，3右边的2,4,2累加和也是8。
   [9, 6, 8, 8, 7, 6, 9, 5, 2, 5]，结果是平衡数不存在。*/
public class HomeWork6 {
    public static void main(String[] args) {

        int[] nums={1,2,5,3,2,4,2};
        int right=nums.length;
        int left=0;
        int mid=0;
        boolean find=false;

        for (int i = 0; i < nums.length ; i++) {

            int rsum=0;
            int lsum=0;
            mid=(right+left)/2;

            for (int j = 0; j <mid; j++) {
                lsum+=nums[j];
            }

            for (int j = mid+1; j <right ; j++) {
                rsum+=nums[j];
            }

            if (rsum ==lsum ) {
                find=true;
            }
        }

        if (find == false) {
            System.out.println("没有");
        }else {
            System.out.println(nums[mid]);
        }

        }

    }

