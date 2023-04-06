package com.atguigu.hashtable;

import org.junit.Test;

import java.util.HashMap;

/*
conflict：冲突
 */
public class TestHashConflict {
    @Test
    public void test1(){
        HashMap<MyKey, Integer> map = new HashMap<>();
        for(int i=1; i<=15; i++){
            map.put(new MyKey(i), i);
        }

    }

    @Test
    public void test2(){
        HashMap<MyKey, String> map = new HashMap<>();
        for (int i = 1; i <= 11; i++) {
            map.put(new MyKey(i), "value"+i);
        }//添加11对键值对到map中，因为哈希冲突文件，会出现红黑树


        for (int i = 1; i <=11; i++) {
            map.remove(new MyKey(i));
        }
        //树结点个数还有5个时，继续删除下一个结点的过程中满足判断根结点的左左结点为null，反树化
    }

    @Test
    public void test3(){
        //演示反树化的过程
        HashMap<MyKey, String> map = new HashMap<>();
        for (int i = 1; i <= 11; i++) {
            map.put(new MyKey(i), "value"+i);
        }//添加11对键值对到map中，因为哈希冲突文件，会出现红黑树

        for (int i = 11; i >=7; i--) {
            map.remove(new MyKey(i));
        }//table[1]下剩余6个结点

        for (int i = 21; i <= 100; i++) {
            map.put(new MyKey(i), "value"+i);//添加到扩容时，反树化
        }
    }
}
