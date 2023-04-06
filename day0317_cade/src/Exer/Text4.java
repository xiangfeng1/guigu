package Exer;

public class Text4 {
    //遍历数组
    static int[] iterateElement(int[] a) {
        System.out.print("[");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+" ");
        }
        System.out.print("]");
        return a;
    }

    //int[]数组实现从小到大排序
    static int[] smallToBigSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length -1- i; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
      return a;
    }


    //数组反转

    static int[] reverse(int[] a){
        for (int i = 0; i < a.length/2; i++) {
            int temp=a[i];
            a[i]=a[a.length-1-i];
            a[a.length-1-i]=temp;
        }
        return a;
    }


    public static void main(String[] args) {
        int [] a={5,6,2,4,1,2};
        iterateElement(a);
        smallToBigSort(a);
        iterateElement(a);

        reverse(a);
        iterateElement(a);
    }

}



