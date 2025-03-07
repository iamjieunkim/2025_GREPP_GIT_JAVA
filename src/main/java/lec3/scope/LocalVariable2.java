package lec3.scope;

import java.util.stream.Stream;

public class LocalVariable2 {

    //스코프:변수의 접근가능 범위
    public int a = 10;

    public void method1(){

        if(true){
            System.out.println("a = " + a);

            int b = 10;
            System.out.println("b = " + b);
        }

        int b = 20;
        System.out.println("b = " + b);
    }
}
