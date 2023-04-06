package Exer;


import static Exer.ArrayUtil.*;
/*（1）定义一个isSmallToBig方法，判断数组元素是否从小到大排序的，返回true或false
（2）定义一个isBigtoSmall方法，判断数组元素是否从大到小排序的，返回true或false
（3）定义一个binarySearchSTB方法，二分查找target是否在一个元素升序排列的int[]数组中，
     不存在返回-1，存在返回第一次找到的下标值。
（4）定义一个binarySearchBTS方法，二分查找target是否在一个元素降序排列的int[]数组中，
     不存在返回-1，存在返回第一次找到的下标值。
（5）定义一个orderSearch方法，顺序查找target是否在int[]数组中，不存在返回-1，存在返
     回第一次找到的下标值。
（6）测试
A：随机产生10个[0,100)的整数放到数组中
B：从键盘输入查找目标
C：判断如果数组是升序排序，就调用binarySearchSTB方法查找目标是否存在，如果是降序排列，就调用binarySearchBTS方法查找是否存在，如果数组无序，就调用orderSearch方法查找目标是否存在。*/
public class Text3 {

    public static void main(String[] args) {
        int[] a=new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i]=(int)(Math.random()*100);
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        int index=0;
        System.out.println(isSmallToBig(a)?"是":"否");

        System.out.println(isBigToSmall(a)?"是":"否");

        index=binarySearchSTB(a,9);
        System.out.println(binarySearchSTB(a,9)!=-1?"找到了！！下标是："+index:"没找到");

        index=binarySearchSTB(a,9);
        System.out.println(binarySearchBTS(a,9)!=-1?"找到了！！下标是："+index:"没找到");

        System.out.println(orderSearch(a,1)!=-1?"找到了":"没找到");
    }



}
