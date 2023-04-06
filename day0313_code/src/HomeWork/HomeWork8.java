package HomeWork;
/*世界上海拔最高山峰是珠穆朗玛峰，它的高度是8848.86米，假如有一张足够大的纸，它的厚度是0.1毫米。
请问，这张纸需要折叠（对折）多少次，才可以折成珠穆朗玛峰的高度?*/
public class HomeWork8 {
    public static void main(String[] args) {
        int num = 0;
        int hight = 8848860;
        for (double i = 0.1; i < hight; i = i * 2) {
            num++;
        }
        System.out.println(num);


    }
}