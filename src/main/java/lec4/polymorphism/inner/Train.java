package lec4.polymorphism.inner;

public class Train extends Vehicle{


    @Override
    public void drive(int distance) {
        System.out.printf("%d 만큼 기찻길로 답립니다!\n", distance);
    }


}
