package HomeWork;
/*案例需求：随机生成一组验证码，验证码由大小写字母和10个阿拉伯数字字符中的任意6位组成。
开发提示：
1、声明一个char[]数组，长度为62，并存储26个小写字母、26个大写字母、10个阿拉伯数字字符
2、随机生成6位下标，下标范围是[0,62)，取出该下标对应的字符，把它们拼接成一个6位字符构成的验证码*/
public class HomeWork4 {
    public static void main(String[] args) {
        char[] chars = new char[62];
        for (int i = 0; i < 26; i++) {
            chars[i]= (char) ('a'+i);
        }
        for (int i = 26; i <52 ; i++) {
            chars[i]=(char) ('A'+(i-26));
        }
        for (int i = 52; i <chars.length ; i++) {
            chars[i]=(char) ('0'+(i-52));
        }

        String  code ="";
        for (int i = 0; i <6 ; i++) {
            int index=(int) (Math.random()*62);
              code+=chars[index];

        }
        System.out.print("验证码为："+code);
    }
}
