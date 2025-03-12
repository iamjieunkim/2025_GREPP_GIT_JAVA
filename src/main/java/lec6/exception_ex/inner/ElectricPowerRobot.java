package lec6.exception_ex.inner;

public class ElectricPowerRobot {

    private Battery battery;
    //일렉트릭 로봇은 한번 작동할때 100큼의 효율이 필요함
    private final int EFFICIENCY = 100;

    public ElectricPowerRobot(Battery battery) {
        this.battery = battery;
    }

    public void doSomething() {

        try {
            battery.use(EFFICIENCY);
        } catch (NoPowerException e) {
            System.out.println(e.getMessage());
            System.out.println("배터리를 충전해주세요!!!");
        }
    }
}
