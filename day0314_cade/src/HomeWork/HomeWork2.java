package HomeWork;
/*案例需求：遍历输出一副扑克牌。*/
public class HomeWork2 {
    public static void main(String[] args) {
        String[] hua = {"黑桃","红桃","梅花","方片"};
        String[] dian = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String[] pu = new String[hua.length*dian.length+2];
            pu[pu.length-2]="大王";
            pu[pu.length-1]="小王";

        for (int i = 0; i < hua.length ; i++) {
            for (int j = 0; j < dian.length ; j++) {
                System.out.print(hua[i]+dian[j]+"\t");
            }
            System.out.println();
        }
        System.out.println(pu[pu.length-2]+"\t"+pu[pu.length-1]);
    }
}
