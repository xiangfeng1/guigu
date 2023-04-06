package HomeWork;

public class HomeWork1 {
    public static void main(String[] args) {
        System.out.println("边长3,4,5是否可以构成三角形：" + isTriangle(3, 4, 5));
        System.out.println("边长3,4,5是否可以构成直角三角形：" + isRightTriangle(3, 4, 5));
        System.out.println("边长3,4,5是否可以构成等腰三角形：" + isIsoscelesTriangle(3, 4, 5));
        System.out.println("边长3,4,5是否可以构成等边三角形：" + isEquilateralTriangle(3, 4, 5));
        System.out.println("边长3,4,5三角形的面积：" + area(3, 4, 5));
        System.out.println("边长3,4,5三角形的周长：" + perimeter(3, 4, 5));
    }

    static boolean isTriangle(double a, double b, double c){
        return a>0&&b>0&&c>0&& a + b > c && b + c > a && a + c > b;
    }
    static boolean isRightTriangle(double a, double b, double c) {
        return isTriangle(a, b, c) && (a * a + b * b == c * c || a * a + c * c == b * b || b * b + c * c == a * a);
    }
    static boolean isIsoscelesTriangle(double a, double b, double c) {
        return isTriangle(a, b, c) && (a == b || b == c || a == c);
    }
    public static boolean isEquilateralTriangle(double a, double b, double c) {
        return isTriangle(a, b, c) && a == b && b == c;
    }

    public static double area(double a, double b, double c) {
        if (!isTriangle(a, b, c)) {
            return 0;
        }
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
    public static double perimeter(double a, double b, double c) {
        if (!isTriangle(a, b, c)) {
            return 0;
        }
        return a + b + c;
    }

}
