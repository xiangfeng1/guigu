package Exer;import java.util.Scanner;public class MyInfo {    public static void main(String[] args) {        Scanner input = new Scanner(System.in);        System.out.print("请输入姓名：");        String name = input.next();        System.out.print("请输入姓名：");        int age = input.nextInt();        System.out.print("请输入姓名：");        double weight = input.nextDouble();        System.out.print("请输入姓名：");        char gender = input.next().charAt(0);        System.out.print("是否结婚？：");        boolean marry = input.nextBoolean();        System.out.println("您的名字："+name+"  年龄："+age+" 体重为:"+weight+" 性别为："+gender+" 是否结婚："+marry);        input.close();    }}