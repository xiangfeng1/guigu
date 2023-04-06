package HomeWork;

import java.util.Scanner;
/*从键盘输入订单总价格totalPrice（总价格必须>=0），
1. 判断当`totalPrice<0`时，显示输入有误
2. 当`totalPrice>=0`时，根据优惠政策计算打折后的总价格。
   - 判断当`totalPrice >=500` ,discount赋值为0.8
   - 判断当`totalPrice >=400` 且`<500`时,discount赋值为0.85
   - 判断当`totalPrice >=300` 且`<400`时,discount赋值为0.9
   - 判断当`totalPrice >=200` 且`<300`时,discount赋值为0.95
   - 判断当`totalPrice >=0` 且`<200`时,不打折，即discount赋值为1
   - 输出结果*/
public class HomeWork3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("请输入订单总价格：");
        double totalPrice = input.nextInt();
        double discount = 0.8;
        if (totalPrice < 0) {
            System.out.println("输入有误");
        } else if (totalPrice >= 500) {
            System.out.println("打折后的价格：" + totalPrice * discount);
        } else if (totalPrice >= 400) {
            discount += 0.05;
            System.out.println("打折后的价格：" + totalPrice * discount);
        } else if (totalPrice >= 300) {
            discount += 0.05;
            System.out.println("打折后的价格：" + totalPrice * discount);
        } else if (totalPrice >= 200) {
            discount += 0.05;
            System.out.println("打折后的价格：" + totalPrice * discount);
        } else {
            //不打折
            discount += 0.05;
            System.out.println("打折后的价格：" + totalPrice);
        }
        System.out.println("订单总价：" + totalPrice);
        System.out.println("享受的折扣：" + discount);
        System.out.println("折扣后总价：" + totalPrice * discount);

        input.close();
    }
}
