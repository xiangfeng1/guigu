package HomeWork.HomeWork1;

import java.util.concurrent.ForkJoinPool;

public class Test {
    public static void main(String[] args) {
        Vehicle[] arr=new Vehicle[5];
        arr[0]=new Bicycle(2);
        arr[1]=new Tricycle(3);
        arr[2]=new Monnocycle(1);
        arr[3]=new Bicycle(2);
        arr[4]=new Monnocycle(1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
            arr[i].drive();
        }
    }
}
