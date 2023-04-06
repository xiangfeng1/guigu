package Exer;
/*
（1）声明如下方法：
- int compare(int a, int b)：比较两个整数大小关系，如果第一个整数比第二个整数大，
    则返回正整数，如果第一个整数比第二个整数小，则返回负整数，如果两个整数相等则返回0；
- int compare(double a, double b)：比较两个小数大小关系，如果第一个小数比第二
    个小数大，则返回正整数，如果第一个小数比第二个小数小，则返回负整数，如果两个小数
    相等则返回0；
- int compare(char a, char b)：比较两个字符大小关系，如果第一个字符比第二个字
    符编码值大，则返回正整数，如果第一个字符比第二个字符编码值小，则返回负整数，如
    果两个字符相等则返回0；
（2）在测试类的main方法中调用，分别比较*/
public class Text7 {
    static int compare(int a,int b){
        if (a>b){
            return 1;
        } else if (a==b) {
            return 0;
        }else {
            return -1;
        }
    }


    static int compare(double a,double b){
        if (a>b){
            return 1;
        } else if (a==b) {
            return 0;
        }else {
            return -1;
        }
    }

    static int compare(char a,char b){
        if (a>b){
            return 1;
        } else if (a==b) {
            return 0;
        }else {
            return -1;
        }
    }


    public static void main(String[] args) {
        System.out.println(compare(4, 7));
        System.out.println(compare(4.5 ,7.3));
        System.out.println(compare('a', 'b'));
        System.out.println(compare(4.3, 7));
    }

}
