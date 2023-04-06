package Exer;

public class ArrayUtil {
    //判断数组元素是否从小到大排序的
     static boolean isBigToSmall(int[] a){
        for (int j = 0; j <a.length-1 ; j++) {
            if(a[j]<a[j+1]){
                return false;
            }
        }
        return true;
    }
    //判断数组元素是否从大到小排序的，返回true或false
    static boolean isSmallToBig(int[] a){
        for (int j = 0; j <a.length-1 ; j++) {
            if(a[j]>a[j+1]){
                return false;
            }
        }
        return true;
    }
    //二分查找target是否在一个元素升序排列的int[]数组中，不存在返回-1，
    // 存在返回第一次找到的下标值
    static int binarySearchSTB(int[] a,int target){
        int right=a.length;
        int left =0;
        int index=-1;
        for (; left <right ;) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                index = mid;
                return index;
            } else if (a[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return index;
    }
    //二分查找target是否在一个元素降序排列的int[]数组中，不存在返回-1，
    // 存在返回第一次找到的下标值
    static int binarySearchBTS(int[] a,int target){
        int right=a.length;
        int left =0;
        int index=-1;

        for (; left <right ;) {
            int mid = (left + right) / 2;
            if (a[mid] == target) {
                index = mid;
                return index;
            } else if (a[mid] < target) {
                right = mid-1 ;
            } else {
                left = mid+1;
            }
        }
        return index;
    }
    //顺序查找target是否在int[]数组中，不存在返回-1，存在返回第一次找到的下标值。
    static int orderSearch(int[] a,int target){
        int index=-1;
        for (int i = 0; i <a.length ; i++) {
            if (a[i] == target) {
                index=i;
                return index;
            }
        }
        return index;
    }

}
