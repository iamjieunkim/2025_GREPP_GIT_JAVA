package lec2.opp;

public class OppSwitch1 {

    public static void main(String[] args) {
        fn1();
        fn2();
        fn3();
        fn4();
    }

    private static void fn4() {

        int number = 15;

        switch (number) {
            case 1, 15:
            case 3:
            case 5:
            case 7:
            case 9:
                System.out.println("홀수");
                break;
            case 2, 12:
            case 4:
            case 6:
            case 8:
            case 10:
                System.out.println("짝수");
                break;
        }
    }


    static void fn3() {
        int gold = 1;
        switch (gold) {

            case 1 -> {
                System.out.println(100);
                System.out.println(100);
            }
            case 2 -> System.out.println(200);
            case 3 -> System.out.println(300);
        }
    }

    static void fn2() {

        int gold = 1;

        switch (gold) {

            case 1:
                System.out.println(100);
                break;
            case 2:
                System.out.println(200);
                break;
            case 3:
                System.out.println(300);
                break;
        }

    }

    static void fn1() {

        int coin = 1;

        switch (coin) {

            case 1:
                System.out.println(100);
            case 2:
                System.out.println(200);
            case 3:
                System.out.println(300);

        }

    }
}
