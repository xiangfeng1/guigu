package Exer;
/*（1）在StringTools类中声明如下方法：
    String concat(char seperator, String... args)
   实现n个字符串进行拼接，每一个字符串之间使用某字符进行
   分割，如果没有传入字符串，那么返回空字符串""
（2）在测试类的main方法中调用测试*/
public class Text6 {
    static String concat(char seperator,String...args){
        char c=seperator;
        String s="";
        for (int i = 0; i < args.length; i++) {
            if (c == 0) {
                s+=args[i];
            }else if(i==args.length-1){
                s+=args[i];
            }else {
                s+=args[i]+c;
            }
        }
        return s;
    }


    public static void main(String[] args) {
        System.out.println(Text6.concat('-'));
        System.out.println(Text6.concat('-',"hello"));
        System.out.println(Text6.concat('-',"hello","world"));
        System.out.println(Text6.concat('-',"hello","world","java"));
    }

}
