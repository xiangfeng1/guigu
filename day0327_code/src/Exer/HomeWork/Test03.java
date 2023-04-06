package Exer.HomeWork;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入原字符串：");
        String src=input.next();

        System.out.println("请输入要删除的字符串");
        String del=input.next();

        String result = src.replaceAll(del, "");
        int count=(src.length()-result.length())/del.length();
        System.out.println(del+"共出现了：" + count + "次");
        System.out.println("删除" + del + "后字符串：" + result);

        input.close();

    }
}
