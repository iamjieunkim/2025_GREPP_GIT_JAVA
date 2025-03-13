package lec7.s3.tools.portable;


import lec7.s3.tools.Portable;
import lec7.s3.tools.Tool;

//portable을 참조하는에 도구를 상속받은 망치(갖고다니는 공구)
public class HammerGrinder extends Tool implements Portable {

    private final String NAME = "HAMMER_GRINDER";

    @Override
    public void portable() {
        System.out.println("Portable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
