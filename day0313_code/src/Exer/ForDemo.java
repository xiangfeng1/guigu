package Exer;

public class ForDemo {
    /*所谓水仙花数是指一个3位数，其各个位上数字立方和等于其本身。
    例如： 153 = 1\*1\*1 + 5\*5\*5 + 3\*3\*3，
    找出所有的水仙花数，并统计他们有几个。*/
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            int ge = i % 10;
            int shi = i / 10 % 10;
            int bai = i / 100;
            if ((ge * ge * ge + shi * shi * shi + bai * bai * bai) == i) {
                System.out.println(i);
            }
        }
    }
}
