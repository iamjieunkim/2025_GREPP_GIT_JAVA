package lec4.extend_example;

import lec4.extend_example.inner.SubClass;

public class ExtendClass {

    public static void main(String[] args) {
        test1();

    }

    private static void test1() {
        SubClass subClass = new SubClass("subClass", "ChildClass");
        subClass.introduce();//?
        subClass.getUniqueName();
    }
}
