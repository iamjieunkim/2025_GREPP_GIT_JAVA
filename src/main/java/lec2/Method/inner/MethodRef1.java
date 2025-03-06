package lec2.Method.inner;

import lec2.Method.Method1;

import static lec2.Method.Method1.printTest1;

public class MethodRef1 {

    public static void main(String[] args) {
        Method1.printTest1(); //public, 다른 패키지에 위치한 경우 public만 사용이 가능하다.
        //printTest1(); 이렇게 불러와서 사용도 가능함
        //Method1.printTest2();
        //Method1.printTest3();
        //Method1.printTest4();
    }
}
