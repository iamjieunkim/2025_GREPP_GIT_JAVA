package lec6.exception_ex.ex0;

import lec6.exception_ex.ex0.inner.Battery;
import lec6.exception_ex.ex0.inner.ElectricPowerRobot;

public class Labo {

    public static void main(String[] args) {

        //배터리가 100정도 충전된 배터리를 만듬
        Battery battery = new Battery(100);
        ElectricPowerRobot robot = new ElectricPowerRobot(battery);

        robot.doSomething();
        robot.doSomething();

    }
}
