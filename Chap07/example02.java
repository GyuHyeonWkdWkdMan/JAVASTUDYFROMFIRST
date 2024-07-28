package Chap07;

public class example02 {
    static void myMethod1() {
        System.out.println("정적 메서드 호출");
    }

    void myMethod2() {
        System.out.println("인스턴스 메서드 호출");
    }

    public static void main(String[] args) {
        myMethod1();
        example02 opt = new example02();
        opt.myMethod2();
    }
}
