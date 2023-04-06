package HomeWork;

import java.util.Scanner;

public class HomeWork4 {
    public static void main(String[] args) {
        char[] koiFishWords = {'一','今','地','定','尚','年','开','我','果','火','爱','硅','结','花','谷','遍'};

        Scanner input = new Scanner(System.in);
        //输入字符多个字符用charAt()截取第一个
        System.out.print("请输入一个字（如果是多个字符截取第一个）：");
        char word = input.next().charAt(0);

        int right=koiFishWords.length-1;
        int left=0;
        int index=-1;

        for (; left <=right ; ) {
            int mid=(right+left)/2;
            if (koiFishWords[mid]==word){
                index+=1;
                break;
            }else if (word >koiFishWords[mid]) {
                left=mid+1;
            }else {
                right=mid-1;
            }
        }

        if (index ==0) {
            System.out.println("找到了");
        }else {
            System.out.println("没找到");
        }

        input.close();
    }
}
