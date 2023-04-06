package Exer;

public class GraphicTools {
    static double triangleArea(double base, double height){
        if (base >0&&height>0) {
            double s=(base*height)/2;
                return s;
        }
        return 0;
    }

    static double triangleArea(double a, double b,double c){
        if(a > 0 && b > 0 && c > 0 && a + b > c && b + c > a && a + c > b){
            double p = (a + b + c)/2;
            return Math.sqrt(p * (p-a) * (p-b) * (p-c));
        }
        return 0;
    }


    public static void main(String[] args) {

    }

}
