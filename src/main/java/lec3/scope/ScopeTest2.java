package lec3.scope;

import lec3.scope.inner.Complex;

public class ScopeTest2 {

    //스코프:변수의 접근가능 범위
    public static int i = 15;

    public static void main(String[] args) {
        test1();
        test2();
    }

    private static void test2() {
        //int i = 20;
        //System.out.println("i = " + i);

        //static을 이 안에서 변경 하는 것도 가능하다
        for(; i<30; i++){
            System.out.println("i = " + i);
        }
        System.out.println("i = " + i);
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
