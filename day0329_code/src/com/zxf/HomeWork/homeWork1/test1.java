package com.zxf.HomeWork.homeWork1;
/*案例需求：
 * 随机生成十组六位字符组成的验证码。
 * 验证码由大小写字母、数字字符组成。*/
import java.util.ArrayList;
public class test1 {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            objects.add(i);
        }
        for (int i = 65; i <90 ; i++) {
            objects.add((char)i);
        }
        for (int i = 97; i <123 ; i++) {
            objects.add((char)i);
        }

        for (int i = 0; i <10 ; i++) {
            String str="";
            for (int j = 0; j < 6; j++) {
                Object num =  objects.get((int)(Math.random() * 61));
                str+=num;
            }
            System.out.println(str);

        }
    }
}
