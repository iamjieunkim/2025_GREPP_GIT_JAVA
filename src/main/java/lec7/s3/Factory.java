package lec7.s3;

import lec7.s3.box.*;
import lec7.s3.other.Apple;
import lec7.s3.tools.portable.Hammer;
import lec7.s3.tools.portable.HugeGrinder;

//테스트 해보자
public class Factory {

    public static void main(String[] args) {
        test1();
        teset2();
    }

    private static void teset2() {
        //hammer는 tool을 상속받았기 때문에 toolBox에 들어갈 수 있다.
        Hammer hammer = new Hammer();
        ToolBox<Hammer> hammerToolBox = new ToolBox<>(hammer);
        hammerToolBox.open();

        //apple은 툴박스에는 들어갈 수 없고, 들고 다닐 수 만 있기 때문에
        Apple apple = new Apple();
        //apple.portable();

        HugeGrinder hugeGrinder = new HugeGrinder();
        ToolBox<HugeGrinder> hugeGrinderToolBox = new ToolBox<>(hugeGrinder);
        hugeGrinderToolBox.open();


    }

    private static void test1() {

        Apple apple = new Apple();
        //박스에 애플 집어넣고
        Box<Apple> appleBox = new Box<>(apple);
        appleBox.open();

        HugeGrinder hugeGrinder = new HugeGrinder();
        Box<HugeGrinder> hugeGrinderBox = new Box<>(hugeGrinder);
        hugeGrinderBox.open();


    }
}
