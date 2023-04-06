package HomeWork;
/*正序和逆序输出26个英文字母*/
public class HomeWork3 {
    public static void main(String[] args) {
        char[] xiaoxie = new char[26];

        for (int i = 0; i <xiaoxie.length ; i++) {
            xiaoxie[i]=(char) ('a'+i);
        }

        System.out.print("正序：");
        for (int i = 0; i <xiaoxie.length ;i++ ) {
            if ((i)%10 ==0 ) {
                System.out.println();
            }

            System.out.print(xiaoxie[i]+"\t");
        }

        System.out.print("\n\n逆序：");
        for (int i = xiaoxie.length-1; i >=0 ;i-- ) {
            if ((i+5)%10 ==0 ) {
                System.out.println();
            }

            System.out.print(xiaoxie[i]+"\t");
        }
    }
}
