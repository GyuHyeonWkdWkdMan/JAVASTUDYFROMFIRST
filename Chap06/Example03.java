package Chap06;

import java.util.Scanner;

public class Example03 {

    public static int[][] makingArray(int[][] Arr) {
        int[][] result = Arr;
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < Arr.length; i++) {
            for (int j = 0; j < Arr[i].length; j++) {
                result[i][j] = s.nextInt();
            }
        }

        s.close();
        return result;
    }

    public static void main(String[] args) {
        int[][] myArr = new int[2][4];
        int[][] convertedArr = makingArray(myArr);
        System.err.println("--------------result---------------");
        for (int i = 0; i < convertedArr.length; i++) {
            for (int j = 0; j < convertedArr[i].length; j++) {
                System.err.println(convertedArr[i][j]);
            }
        }
    }
}
