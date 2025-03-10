package lec4.abstract_ex.s0.inner;

public class Jphone extends SmartPhone {

    private boolean isSameType = true;

    public Jphone(boolean power, int sound, int lightLevel) {
        super(power, sound, lightLevel);
    }

    public void setTargetPhone(SmartPhone targetPhone) {
        this.isSameType = targetPhone instanceof Jphone;
    }

    @Override
    public void call() {
        if( this.power ){
            System.out.println("통화");
        }
    }

    @Override
    public void msg() {
        if(this.isSameType) {
            System.out.println("파란색");
        }else{
            System.out.println("초록색");
        }
    }
}
