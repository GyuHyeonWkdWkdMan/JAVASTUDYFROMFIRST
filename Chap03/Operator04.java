package Chap03;

public class Operator04 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        @SuppressWarnings("unused") // unused 경고 배제
        int c;
        System.out.println(c = a);
        System.out.println(b += a);
        System.out.println(b -= a);
        System.out.println(b *= a);
        System.out.println(b /= a);
        System.out.println(b %= a);
    }
}
