package com.atguigu.link;

import java.util.Iterator;

public class SingleLinkedList<E> implements Iterable<E>{
    private SingleNode<E> first;
    private int size;

    public void add(E e){
        //创建结点
        SingleNode<E> newNode = new SingleNode<>(e,null);

        if(first == null){//链表是空额
            first = newNode;
        }else {//链表非空
            //查找末尾结点
            SingleNode<E> node = first;
            while (node.next != null) {
                node = node.next;
            }

            //把新结点连接到node的后面
            node.next = newNode;
        }

        //元素个数增加
        size++;
    }

    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E>{
        SingleNode<E> node = first;

        @Override
        public boolean hasNext() {
            return node != null;
        }

        @Override
        public E next() {
            E data = node.data;
            node = node.next;
            return data;
        }
    }

    private static class SingleNode<E>{
        E data;
        SingleNode<E> next;

        SingleNode(E data, SingleNode<E> next) {
            this.data = data;
            this.next = next;
        }
    }
}
