package Chap07;

public class Constructor02 {
    public static void main(String[] args) {
        System.out.println("**** 학생 주소록 ****");
        Student stObj1 = new Student();

        stObj1.insertRecord(20221004, "최규현");
        stObj1.printInfo();

        Student stObj2 = new Student(20221005, "Réa Nouzières");
        stObj2.printInfo();
    }

}
