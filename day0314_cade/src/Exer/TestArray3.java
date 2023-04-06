package Exer;

public class TestArray3 {
    public static void main(String[] args) {
        char[] letters=new char[26];
        char[] bigLetters=new char[26];
        for (char i='a';i<='z';i++) {
            letters[i-97]=i;
            bigLetters[i-97]=(char) (i-32);
            System.out.print(letters[i-97]);
            System.out.print("->>");
            System.out.println(bigLetters[i-97]);
        }
    }
}
