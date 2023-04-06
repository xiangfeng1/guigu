package Exer;
/*
 (1）定义一个maxInArray方法，查找int[]数组中最大值
（2）定义一个minInArray方法，查找int[]数组中最小值
（3）测试
A：随机产生10个[0,100)的整数放到数组中
B：调用上面的方法找出最大值和最小值*/
public class text2 {
    public static void main(String[] args) {
        int[] a={1,5,2,4,9,2,4};
        System.out.println(maxInArray(a));
        System.out.println(minInArray(a));
    }
    static int maxInArray(int[] a){
        int max=a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]>max ) {
                max=a[i];
            }
        }
        return max;
    }
    static int minInArray(int[] a){
        int min=a[0];
        for (int i = 1; i <a.length ; i++) {
            if (a[i]<min ) {
                min=a[i];
            }
        }
        return min;
    }
}
