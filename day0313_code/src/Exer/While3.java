package Exer;

public class While3 {
    public static void main(String[] args) {
        int i = 1;
        while (i < 151) {
            System.out.print(i);
            if (i % 3 == 0) {
                System.out.print("\tfoo");
            }
            if (i % 5 == 0) {
                System.out.print("\tbiz");
            }
            if (i % 7 == 0) {
                System.out.print("\tbaz");
            }
            System.out.println();
            i++;
        }
    }
}
