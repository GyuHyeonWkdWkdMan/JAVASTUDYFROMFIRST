package Chap06;

import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        System.err.print("학급의 인원은 몇 명인가요? : ");
        Scanner s = new Scanner(System.in);
        int number_of_student = s.nextInt();

        double sum = addGrade(grademaker(number_of_student));
        double average = sum / number_of_student;
        System.err.println("학생들의 총점은 " + sum + "점이고, 학생들의 점수 평균은 " + average + "점 입니다.");

        s.close();

    }

    public static double[] grademaker(int num) {
        Scanner t = new Scanner(System.in);
        double[] grade = new double[num];
        for (int i = 0; i < num; i++) {
            System.err.print(i + 1 + "번 학생의 점수를 입력해주세요. : ");
            grade[i] = t.nextDouble();

        }

        t.close();
        return grade;
    }

    public static double addGrade(double[] grade) {
        double result = 0;
        for (int i = 0; i < grade.length; i++) {
            result += grade[i];
        }

        return result;
    }

}
