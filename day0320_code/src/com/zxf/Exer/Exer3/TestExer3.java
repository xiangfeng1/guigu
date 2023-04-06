package com.zxf.Exer.Exer3;


import static com.zxf.Exer.Exer3.Exer3.*;
/*在练习题1的基础上，声明构造器。*/

public class TestExer3 {
    public static void main(String[] args) {
        Exer3[] exer = new Exer3[3];
        for (int i = 0; i < exer.length; i++) {
            exer[i]=new Exer3(8-i,2+i);
        }

        System.out.println("排序前：");
        //遍历数组
        a(exer);
        System.out.println("---------------------------");
        System.out.println("按照长度排序后：");
        //按照长度排序
        sort(exer);
        a(exer);
        System.out.println("---------------------------");
        System.out.println("按照面积从小到大排序后：");
        //按照面积排序
        AreaSort(exer);
        a(exer);

    }

}

