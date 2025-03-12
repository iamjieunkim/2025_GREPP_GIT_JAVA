package lec6.s0;

import lec6.s0.inner.MyGeneric;

public class MyGenericTests {

    public static void main(String[] args) {
        test1();
    }

    private static void test1() {
        //MyGeneric<K, V, T>

        MyGeneric<String, String, String> generic = new MyGeneric<>();
        //MyGeneric<String, Integer, String> generic2 = new MyGeneric<>();

        generic.setKey("key");
        generic.setValue("value");
        generic.setType("type");
        //generic.setType(1);

        System.out.println("generic = " + generic);

    }
}
