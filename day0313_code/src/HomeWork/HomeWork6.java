package HomeWork;
/*打印五行直角三角形*/
public class HomeWork6 {
    public static void main(String[] args) {
        for (int i = 0; i <6 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

