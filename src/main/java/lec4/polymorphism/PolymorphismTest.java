package lec4.polymorphism;

import lec4.polymorphism.inner.Airplane;
import lec4.polymorphism.inner.Train;
import lec4.polymorphism.inner.Vehicle;

public class PolymorphismTest {

    static int DISTANCE = 100;

    public static void main(String[] args) {
        //Airplane airplane = new Airplane();
        //airplane.drive(DISTANCE);

        //Train train = new Train();
        //train.drive(DISTANCE);

        go(new Train(), DISTANCE);
        go(new Airplane(), DISTANCE);
    }

    static void go(Vehicle vehicle, int DISTANCE) {
        vehicle.drive(DISTANCE);
    }


}
