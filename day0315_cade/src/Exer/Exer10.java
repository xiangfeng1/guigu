package Exer;

public class Exer10 {
    public static void main(String[] args) {
        int[][] array=new int[10][];
        for (int i = 0; i <array.length ; i++) {
            array[i] = new int[i+1];
            array[i][0]=1;
            array[i][i]=1;
            for (int j = 1; j <array[i].length-1 ; j++) {
                array[i][j] = array[i-1][j-1] + array[i-1][j];
            }
            System.out.println();
        }

        for (int i = 0; i <array.length ; i++) {
            for (int j = 0; j <array[i].length ; j++) {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
