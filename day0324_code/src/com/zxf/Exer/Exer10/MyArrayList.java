package com.zxf.Exer.Exer10;

import java.util.Iterator;

public class MyArrayList implements Iterable{
    private Object[] all=new Object[2];
    private int total;

    public void add(Object element){
        if(total>=all.length){
            System.out.println("数组已满，无法添加");
            return;
        }
        all[total++] = element;
    }

    @Override
    public Iterator iterator() {
        return new Itr();
    }
    private class Itr implements Iterator{
        int cursor;
        @Override
        public boolean hasNext() {
            return cursor<total;
        }

        @Override
        public Object next() {
            return all[cursor++];
        }
    }
}
