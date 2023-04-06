package Exer;

public class Demo02 {
    public static void main(String[] args) {
        for (int i = 2; i <=100 ; i++) {
            for (int j = 1; j <=i ; j++) {
                if (i%j ==0) {
                    System.out.print(" "+j);
                }
            }
            System.out.println();
        }
    }
}
