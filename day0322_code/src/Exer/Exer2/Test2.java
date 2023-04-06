package Exer.Exer2;

public class Test2 {
    public static void main(String[] args) {

     Graphic[] arr = new Graphic[3];
    arr[0] = new Rectangle(3,6);
    arr[1]  = new Triangle(3,4,5);
    arr[2]  = new Circle(2);


        for (int i = 0; i < arr.length; i++) {
        System.out.println(arr[i]);
    }
}
}
