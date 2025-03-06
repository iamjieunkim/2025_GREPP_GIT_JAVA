package lec1;

public class Lecture6 {

    public static void main(String[] args) {

        //int a = null; 오류발생

        int primitiveInt = 10;

        //무조건 정수 자료형만 들어갈 수 있다.
        //Integer wrappedInt = 10;
        Integer wrappedInt = Integer.valueOf(10);
        wrappedInt = null;

        //기본자료형 외에 모든 자료형은 참조자료형

    }
}
