package com.atguigu.link;

import java.util.Iterator;

/*
尝试自定义双向链表（部分方法）
 */
public class PairLinkedList<E> implements Iterable<E>{
    private PairNode<E> first;
    private PairNode<E> last;
    private int size;

    public void add(E e){
       // （1）先创建结点把e包装起来
        PairNode<E> newNode = new PairNode<>(last, e, null);

        //(2)分情况
        if(first == null){//链表是空的  first == null 或  last == null
            first = newNode;
        }else{
            last.next = newNode;
        }

        //(3)新结点链表的最后一个结点
        last = newNode;

        //(4)元素个数增加
        size++;
    }

    public void add(int index, E e){
        //检查index的合法性
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        //确定index对应的结点
        PairNode<E> node = first;
        for(int i = 0; i< index; i++){
            node = node.next;
        }

        if(node == null){//末尾添加
            add(e);
        }else {//非末尾位置添加
            //在该结点的前面插入新的结点
            // （1）先创建结点把e包装起来
            PairNode<E> newNode = new PairNode<>(node.previous, e, node);

            if(node.previous == null){//插入位置是头部
                first = newNode;
            }else{//插入位置非头部
                node.previous.next = newNode;
            }
            node.previous = newNode;

            size++;
        }
    }

    public void remove(Object obj){
        //找到obj对应的node
        PairNode<E>  node = first;
        if(obj == null){
            while(node != null){
                if(node.data == null){
                    break;
                }
                node = node.next;
            }
        }else{
            while(node != null){
                if(obj.equals(node.data)){
                    break;
                }
                node = node.next;
            }
        }

        if(node == null){//被删除结点不存在，不是删除
            return;
        }

        if(node.previous == null){//头部删除
            node.next.previous = null;
            //或 node.next.previous  = node.previous;
            first = node.next;
        }else {//非头部删除
            node.previous.next = node.next;

            if (node.next == null) {//尾部删除
                last = node.previous;
            } else {//非尾部删除
                node.next.previous = node.previous;
            }
        }

        node.previous = null;
        node.next = null;
        node.data = null;
        size--;
    }



    @Override
    public Iterator<E> iterator() {
        return new Itr();
    }

    private class Itr implements Iterator<E>{
        PairNode<E> node = first;

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

    private static class PairNode<E>{
        PairNode<E> previous;
        E data;
        PairNode<E> next;

        PairNode(PairNode<E> previous, E data, PairNode<E> next) {
            this.previous = previous;
            this.data = data;
            this.next = next;
        }
    }
}
