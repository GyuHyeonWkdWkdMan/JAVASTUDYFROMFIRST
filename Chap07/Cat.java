package Chap07;

public class Cat {
    String breed;
    String color;
    int age = 10;

    Cat() {
        System.out.println("Cat() 생성자 호출.");
    }

    Cat(String pBreed) {
        System.out.println("Cat(...) 생성자 호출합니다.");
        breed = pBreed;
    }

    Cat(String pBreed, String pColor) {
        System.out.println("Cat(..., ...) 생성자 오버로드했습니다.");
        breed = pBreed;
        color = pColor;
    }

    void eat() {
        System.out.println("먹이를 먹다");
    }

    void scratch() {
        System.out.println("발톱으로 할퀴다");
    }

    void meow() {
        System.out.println("야옹 하고 울다");
    }

}
