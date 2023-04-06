package Exer;



import java.util.Scanner;
/*从键盘输入1-12，显示对应的单词。*/
public class TestArray2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        while (true) {
            System.out.println("请输入一个整数(1--7)：");
            num = input.nextInt();
            if (num > 0 && num < 8) {
                break;
            }
        }

     //输入的星期-1是数组下表
        System.out.println("星期" + num +"是" + week[num-1]);

        input.close();
    }
}
