package lec6.s0;

import lec6.s0.inner.MyStaticGeneric;

public class MyStaticGenericTest {

    public static void main(String[] args) {
        test1();
    }

    private static void test2() {

    }

    private static void test1() {

        String hello = MyStaticGeneric.test1("Hello");
        System.out.println("hello = " + hello);

        MyStaticGeneric.test3(100);

        MyStaticGeneric myStaticGeneric = new MyStaticGeneric();
        myStaticGeneric.test2();
    }
}
