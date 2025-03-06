package lec2.Method;

public class Method1 {

    public static void main(String[] args) {
        printTest1();
        printTest2();
        printTest3();
        printTest4();
    }

    public static void printTest1() {
        System.out.println("public");
    }

    static void printTest2() {
        System.out.println("default");
    }

    protected static void printTest3() {
        System.out.println("protected");
    }

    private static void printTest4() {
        System.out.println("private");
    }






}
