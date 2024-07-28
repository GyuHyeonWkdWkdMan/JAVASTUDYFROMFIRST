package Chap07;

public class example01 {
    public static void main(String[] args) {
        Cat catobj = new Cat();
        catobj.breed = "페르시안 고양이";
        catobj.color = "흰색";

        System.out.println("품종 : " + catobj.breed);
        System.out.println("색상 : " + catobj.color);
    }

}
