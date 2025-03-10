package lec4.polymorphism.inner;

public class Airplane extends Vehicle {

    @Override
    public void drive(int distance) {
        System.out.printf("%d 만큼 날아갑니다!\n", distance);
    }


}
