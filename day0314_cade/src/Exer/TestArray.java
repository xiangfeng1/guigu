package Exer;

/*5个随机偶数*/
public class TestArray {
    public static void main(String[] args) {
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = (int) (Math.random() * 50) * 2;
            System.out.println(nums[i]);
        }
    }
}