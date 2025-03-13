package lec7.s3.tools.portable;


import lec7.s3.tools.Installable;
import lec7.s3.tools.Tool;

//portable을 참조하는에 도구를 상속받은 망치(설치형공구_)
public class HugeCrowbar extends Tool implements Installable {

    private final String NAME = "VERY_HUGE_CROWBAR";


    @Override
    public void installable() {
        System.out.println("Installable");
    }

    @Override
    public String getName() {
        return this.NAME;
    }
}
