package Chap04;

import java.util.Scanner;

public class Example03 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.");

        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if (num == 10) {
            System.out.println(num + "은 10입니다");
        } else if (num == 15) {
            System.out.println(num + "은 15입니다.");
        } else if (num == 20) {
            System.out.println(num + "은 20입니다.");
        } else {
            System.out.println("숫자가 존재하지 않습니다.");
        }
        System.out.println("이 문장은 if문 외부에 있습니다.");
        s.close();
    }
}
