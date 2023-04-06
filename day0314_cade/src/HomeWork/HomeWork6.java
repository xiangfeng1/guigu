package HomeWork;

public class HomeWork6 {
    public static void main(String[] args) {
                int[] front = new int[35];
                int[] after = new int[12];

                for (int i = 1; i <=5; i++) {
            /*
            Math.random()：[0,1)的小数
            Math.random() * front.length：[0,front.length)的小数
             (int)(Math.random() * front.length)：[0,front.length)的整数，[0,front.length-1]
             */
                    int index;
                    do{
                        index = (int)(Math.random() * front.length);
                    }while(front[index]==1);
                    front[index] = 1;
                }

                for (int i = 1; i <=2; i++) {
                    int index;
                    do{
                        index = (int)(Math.random() * after.length);
                    }while(after[index]==1);
                    after[index] = 1;
                }

                System.out.println("本期大乐透中奖号码：");
                System.out.print("前区号码为：");
                for (int i = 0; i < front.length; i++) {
                    if(front[i] == 1){
                        System.out.print(i+1+"\t");
                    }
                }
                System.out.print("\n后区号码为：");
                for (int i = 0; i < after.length; i++) {
                    if(after[i] == 1){
                        System.out.print(i+1+"\t");
                    }
                }
                System.out.println();
            }

        }

