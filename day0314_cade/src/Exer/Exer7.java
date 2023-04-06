package Exer;

/*菱形*/
public class Exer7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //打印空格
            for (int j = 4; j >= i; j--) {
                System.out.print("   ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("   ");
            }
            for (int k = 1; k <= 9 - 2 * i; k++) {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }
}
