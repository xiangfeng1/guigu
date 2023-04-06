package HomeWork;

import java.util.Scanner;

/*从键盘输入一个字符，判断它是字母（a-z或A-A）、数字（0-9)，还是其他字符*/
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("请输入一个字符（数字，字母截取第一个）：");
        char zifu = input.next().charAt(0);

        if (zifu >= '0' && zifu <= '9') {
            System.out.println(zifu + "该字符为数字字符");
        } else if (zifu >= 'a' && zifu <= 'z' || zifu >= 'A' && zifu <= 'Z') {
            System.out.println(zifu + "该字符为字母字符");
        } else {
            System.out.println(zifu + "该字符为其他字符");
        }
        //关闭
        input.close();
    }
}
