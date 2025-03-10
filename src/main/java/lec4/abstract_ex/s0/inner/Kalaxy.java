package lec4.abstract_ex.s0.inner;

public class Kalaxy extends SmartPhone{

    private int recordCount = 0;

    public Kalaxy(boolean power, int sound, int lightLevel) {
        super(power, sound, lightLevel);
    }

    @Override
    public void call() {
        if (super.power) {
            System.out.println("통화를 합니다");
            recordCount++;
        }
    }

    @Override
    public void msg() {
        //this, super를 쓰나 관계 없음, super는 8번째 super에 직접 접근
        if(this.power){
            System.out.println("문자를 합니다");
        }
    }
}
