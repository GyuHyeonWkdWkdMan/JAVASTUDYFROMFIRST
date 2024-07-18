package Chap02;

public class Example01 {
    public static void main(String[] args) {
        final int SPEED = 20;
        int count = 10;
        // SPEED = 40; // << 상수를 초기화할 수 없으므로 오류 발생
        count = 11;
        System.out.println("상수 SPEED 값은 ");
        System.out.println(SPEED);
        System.out.println("변수 count 값은 ");
        System.out.println(count);
    }
}
