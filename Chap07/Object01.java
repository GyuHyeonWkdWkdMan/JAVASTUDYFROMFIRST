package Chap07;

public class Object01 {
    public static void main(String[] args) {
        Student stObj1 = new Student();

        stObj1.id = 20221004;
        stObj1.name = "최규현";
        stObj1.printInfo();

        Student stObj2 = new Student();
        stObj2.insertRecord(20221005, "최규순");
        stObj2.printInfo();
    }

}
