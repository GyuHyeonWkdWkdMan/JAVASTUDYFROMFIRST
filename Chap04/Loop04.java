package Chap04;

import java.util.Scanner;

public class Loop04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("길이 : ");
        int len = s.nextInt();

        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (len * 2) - 1 - (i * 2); k++) {
                System.out.print('*');
            }
            System.err.println();

        }

        s.close();
    }
}
