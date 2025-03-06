package lec2.opp;

public class choose4 {

    static int A = 10;
    static int B = 20;

    public static void main(String[] args) {
        //fn1();
        //fn2();
        fn3();
    }

    private static void fn3() {
        /*
        if( 1==0)
            if(1==1)
                System.out.println("1");
        else
            System.out.println("2");
        */

        if (1 == 0) {
            if (1 == 1) {
                System.out.println("1");
            }
        } else {
            System.out.println("2");
        }
    }

    private static void fn2() {
        if (A >= 10) {
            if (B >= 10) {
                B = 1;
            } else {
                B = -1;
            }
        }
        System.out.println("b = " + B);
    }


    static void fn1() {

        if ((A >= 10) && (B >= 0)) {
            B = 1;
        }

        if ((A >= 10) && (B < 0)) {
            B = -1;
        }

        System.out.println("B = " + B);

    }


}
