package HomeWork;
/*判断某个数组是否属于对称数组，即数组正序遍历和倒序遍历的结果是一样的*/
public class HomeWork5 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,3,2,1};
        int[] arrd = new int[arr.length];
        for (int i = arr.length-1,a=0; i>=0 ; i--,a++) {
            arrd[a]=arr[i];
        }
        boolean a=true;
        for (int i = 0; i <arrd.length ; i++) {
            if (arrd[i] == arr[i]) {
            }else {
                a=false;
            }
        }
        System.out.println(a?"对称":"不对称");



    }
}
