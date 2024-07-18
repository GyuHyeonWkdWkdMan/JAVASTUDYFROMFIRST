package Chap05;

import java.util.Scanner;

public class Method04 {
    public static int getSum(int num) {
        int result = 0;
        for (int i = 1; i <= num; i++) {
            result += i;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        System.err.println(getSum(a));

        s.close();
    }

}
