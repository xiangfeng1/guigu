package com.atguigu.hashtable;

public class MyKey{
    private int num;

    public MyKey(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "MyKey{" +
                "num=" + num +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MyKey myKey = (MyKey) o;

        return num == myKey.num;
    }

    @Override
    public int hashCode() {
        if(num<=20){
            return 1;//故意制造hash冲突
        }
        return num;
    }
}
