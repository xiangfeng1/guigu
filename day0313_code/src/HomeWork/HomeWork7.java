package HomeWork;
/*5个一行输出1-100之间的偶数*/
public class HomeWork7 {
    public static void main(String[] args) {
        for (int i = 2; i <100 ; i+=2) {
            System.out.print(i+" ");
            if (i %10==0) {
                System.out.println();
            }
        }
    }
}
