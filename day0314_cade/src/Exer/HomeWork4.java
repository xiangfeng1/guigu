package Exer;
/*打印空心菱形*/
public class HomeWork4 {
    public static void main(String[] args) {
        for (int i = 1; i <=5 ; i++) {
            //打印空格
            for (int j = 4; j >=i ; j--) {
                System.out.print("   ");
            }
            //打印*
            for (int k =1 ; k <=2*i-1 ; k++) {
                if (k == 1||k==2*i-1) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }

        for (int i = 1; i <=4 ; i++) {
            //打印空格
            for (int j = 1; j <=i ; j++) {
                System.out.print("   ");
            }
            //打印*
            for (int k = 1; k <=9-2*i ; k++) {
                if (k == 1||k==9-2*i) {
                    System.out.print(" * ");
                }else {
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
