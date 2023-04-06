package com.zxf.Exer.Exer11;

public class Test  {
    public static void main(String[] args) {
        Rest[] rests=new Rest[3];
      rests[0]=new Rest(){
            @Override
            public void rest() {
                System.out.println("休息就是睡大觉");
            }
        };

        rests[1]=new Rest(){
            @Override
            public void rest() {
                System.out.println("休息就是到处浪");
            }
        };

        rests[2]=new Rest(){
            @Override
            public void rest() {
                System.out.println("休息就是偷偷学习");
            }
        };


        for (int i = 0; i < rests.length; i++) {
            rests[i].rest();
        }
    }
}
