package Chap07;

public class example04 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.breed = "페르시안";
        Cat cat2 = new Cat();
        cat2.breed = "샴";
        Cat cat3 = new Cat();
        cat3.breed = "러시안블루";

        System.out.println("첫번째 고양이 품종 : " + cat1.breed);
        System.out.println("두번째 고양이 품종 : " + cat2.breed);
        System.out.println("세번째 고양이 품종 : " + cat3.breed);
    }
}
