package lec3.scope;

public class LocalVariable {

    //스코프 변수의 접근가능 범위

    void method1(){
        int x = 10;
        System.out.println("x = " + x);
    }

    void method2(){
        //얘는 사용 못함 왜냐 method1에서만 선언된 변수이기 때문에 X가
        //System.out.println("x = " + x);
        int x = 20;
        System.out.println("x = " + x);
    }

    void method3(int y){
        int x = 10;
        System.out.println(x+y);
    }
}
