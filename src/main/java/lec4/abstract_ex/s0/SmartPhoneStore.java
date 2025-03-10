package lec4.abstract_ex.s0;

import lec4.abstract_ex.s0.inner.Jphone;
import lec4.abstract_ex.s0.inner.Kalaxy;
import lec4.abstract_ex.s0.inner.SmartPhone;

public class SmartPhoneStore {

    public static void main(String[] args) {
       //customer1();
       //customer2();
       customer3();
    }

    //캘럭시 제이폰 비교해달라는
    private static void customer3() {
        //제이폰 2개랑
        Jphone jphone1 = generateJphone();
        Jphone jphone2 = generateJphone();
        //캘럭시1개랑 비교중
        Kalaxy kalaxy1 = generateKalaxy();

        jphone1.setTargetPhone(jphone2);
        jphone2.setTargetPhone(kalaxy1);

        jphone1.call();
        jphone1.msg();

        jphone2.call();
        jphone2.msg();

    }

    //캘럭시 사간 손님
    private static void customer2() {
        Kalaxy kalaxy25 = generateKalaxy();
        kalaxy25.msg();
        kalaxy25.call();
    }

    private static Kalaxy generateKalaxy() {
        return new Kalaxy(true, 10, 10);
    }

    private static Jphone generateJphone() {
        return new Jphone(true, 10, 10);
    }


    //핸드폰 만들어줌
    private static void customer1() {
        SmartPhone smartPhone = new SmartPhone(true, 10, 10) {

            @Override
            public void call() {
                System.out.println("따르릉");
            }

            @Override
            public void msg() {
                System.out.println("문자!");
            }
        };

        smartPhone.call();
        smartPhone.msg();
    }
}
