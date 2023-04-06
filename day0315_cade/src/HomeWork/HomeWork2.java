package HomeWork;

import java.util.Scanner;
/*案例需求：从键盘输入一个单词，判断它是否是回文单词。*/
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入一个单词：");
        String word = input.next();
        char[] chars=word.toCharArray();

        boolean panduan=true;
        for (int i = 0; i <chars.length/2 ; i++) {
            if (chars[i]==chars[chars.length-1-i]) {
            }else {
                panduan=false;
            }
        }
        System.out.println(panduan?"是回文数":"不是回文数");


        input.close();
    }
}
