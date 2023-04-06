package Exer;

import java.util.Scanner;
/*
（1）定义一个add方法，可以实现两个整数求和
（2）定义一个subtract方法，可以实现两个整数求差
（3）定义一个multiply方法，可以实现两个整数求乘积
（4）定义一个divide方法，可以实现两个整数求商
（5）定义一个remainder，可以实现两个整数求余数
（6）定义一个方法calulate，可以实现同时返回两个整数的和、差、乘积、商、余数
（7）测试调用，从键盘输入两个整数，调用上面的方法测试*/
public class Text1 {
    static  int add(int a,int b){
        return (a+b);
    }
    static int subtract(int a,int b){
        return (a-b);
    }
    static int multiply(int a,int b){
        return (a*b);
    }
    static int divide(int a,int b){
        return (a/b);
    }
    static int remainder(int a,int b){
        return (a%b);
    }
    static int[] calulate(int a,int b){
        int[] d=new int[5];
        d[0]=a+b;
        d[1]=a-b;
        d[2]=a*b;
        d[3]=a/b;
        d[4]=a%b;
        System.out.println("两个数的和为："+ d[0]);
        System.out.println("两个数的差为："+ d[1]);
        System.out.println("两个数的乘积为："+ d[2]);
        System.out.println("两个数的商为："+ d[3]);
        System.out.println("两个数的余数为："+ d[4]);
    return d;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入第一个数");
        int a=input.nextInt();
        System.out.println("请输入第二个数");
        int b=input.nextInt();
        System.out.println("两个数的和为："+ add(a,b));
        System.out.println("两个数的差为："+ subtract(a,b));
        System.out.println("两个数的乘积为："+ multiply(a,b));
        System.out.println("两个数的商为："+ divide(a,b));
        System.out.println("两个数的余数为："+ remainder(a,b));
        System.out.println("----------------------------------");
        calulate(a,b);

    }
}
