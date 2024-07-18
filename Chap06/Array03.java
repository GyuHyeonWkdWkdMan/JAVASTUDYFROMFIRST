package Chap06;

import java.util.Scanner;

public class Array03 {

    public static int[][] makeScoreboard(int[][] arr) {
        int[][] result = arr;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j % 2 == 0) {
                    System.out.print((i + 1) + "번 학생의 국어 점수 입력 : ");
                } else {
                    System.out.print((i + 1) + "번 학생의 수학 점수 입력 : ");
                }

                result[i][j] = s.nextInt();
            }
        }
        s.close();
        return result;
    }

    public static void main(String[] args) {

        int[][] scores = new int[2][2];
        int[] sum = new int[2];
        int[] avr = new int[2];
        int[][] madeScores = makeScoreboard(scores);
        for (int i = 0; i < madeScores.length; i++) {
            for (int j = 0; j < madeScores[i].length; j++) {
                sum[i] += madeScores[i][j];
                if (j % 2 == 0) {
                    System.out.println((i + 1) + "번 학생의 국어 점수 : " + madeScores[i][j]);
                } else {
                    System.out.println((i + 1) + "번 학생의 수학 점수 : " + madeScores[i][j]);
                }
            }
            System.out.println(i + "번 학생의 총점 : " + sum[i]);
            avr[i] = sum[i] / 2;
            System.out.println(i + "번 학생의 평균 : " + avr[i]);
        }

    }
}
