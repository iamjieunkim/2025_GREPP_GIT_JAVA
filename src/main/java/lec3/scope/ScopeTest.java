package lec3.scope;

import lec3.scope.inner.Complex;

public class ScopeTest {

    //스코프:변수의 접근가능 범위
    public static int i = 15;

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        //soutm
        System.out.println("ScopeTest.test1");

        Complex complex = new Complex();
        System.out.println("complexA = " + complex.a);

        complex.method1();
        System.out.println("complexA = " + complex.a);
    }


}
