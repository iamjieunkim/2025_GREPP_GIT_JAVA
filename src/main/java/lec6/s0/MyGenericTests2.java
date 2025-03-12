package lec6.s0;

import lec6.s0.inner.MyGeneric;

public class MyGenericTests2 {

    public static void main(String[] args) {
        test1();
        test2();
        test3();
        test4();

    }

    private static void test4() {
        //Null때문에 반드시 <>안에는 참조형이 와야된다. 무조건 래핑 되어있는 값만 올 수 있음.
        //MyGeneric<String, int, boolean> generic = new MyGeneric<>();->절대 못씀
        //Null때문에 반드시 <>안에는 참조형이 와야된다. 무조건 래핑 되어있는 값만 올 수 있음.
        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();
    }

    private static void test3() {
        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();
        generic.setKey("test3");
        //generic.setKey(100);
        //다른 제너릭이 올때까지 한번 지정된 제너릭은 끝까지 유지가 된다.
    }

    private static void test2(){
        MyGeneric<String, Integer, Boolean> generic = new MyGeneric<>();
        generic.setKey("key");
        generic.setValue(1);
        generic.setType(false);

        System.out.println("generic = " + generic);
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
