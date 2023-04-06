package com.zxf.Exer.buffer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
        coll.add(new Employee(1,"张三",5200));
        coll.add(new Employee(2,"李四",15500));
        coll.add(new Employee(3,"王五",12000));
        coll.add(new Employee(4,"赵六",18000));
        coll.add(new Employee(5,"辅导",13000));
        Object[] objects = coll.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

        System.out.print("输入姓名：");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        boolean flag=false;
        for (int i = 0; i <objects.length; i++) {
            if ( ((Employee)objects[i]).getName().equals(name)) {
                 flag=true;
                 break;
            }
        }
        System.out.println(flag?"存在":"不存在");


        coll.removeIf(new Predicate() {
            @Override
            public boolean test(Object o) {
                return ((Employee)o).getSeary()>13000;
            }
        });

         objects = coll.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }

    }
}
