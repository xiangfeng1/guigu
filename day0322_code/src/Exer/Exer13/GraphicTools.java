package Exer.Exer13;

public class GraphicTools {
    public static int compare(Graphic s1, Graphic s2){
        if (s1.area()>s2.area()) {
            return 1;
        } else if (s1.area()<s2.area()) {
            return -1;
        }else {
            return 0;
        }
    }

    public static void sort(Graphic[] arr){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j <arr.length-1-i ; j++) {
                boolean s=false;
                if (arr[i].area()>arr[i+1].area()){
                        s=true;
                }else if(arr[i].area()==arr[i+1].area()){
                    if (arr[i].perimeter() > arr[i].perimeter()) {
                        s=true;
                    }else {
                        s=false;
                    }
                }
                if (s) {
                    Graphic temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }

    public static void print(Graphic[] arr){
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
    }

}
