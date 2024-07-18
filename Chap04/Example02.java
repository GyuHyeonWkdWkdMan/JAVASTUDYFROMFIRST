package Chap04;

import java.util.Scanner;

public class Example02 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num < 50) {
            System.out.println("숫자가 50보다 작습니다.");
        } else {
            System.out.println("숫자가 50보다 큽니다.");
        }
        s.close();
    }
}
