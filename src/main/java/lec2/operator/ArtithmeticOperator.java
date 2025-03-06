package lec2.operator;

public class ArtithmeticOperator {

    //산술연산자 +, -, *, /, %, ++(증감), --(증감)
    public static void main(String[] args) {

        int pmA = 10, pmB = 5;
        System.out.println(pmA + pmB);
        System.out.println(pmA - pmB);
        System.out.println(pmA * pmB);
        System.out.println(pmA / pmB);
        System.out.println(pmA % pmB);

        String hello = "hello";
        String world = "world";
        String result = hello + world;
        System.out.println("result = " + result);


        //증감 연산자
        int preIncA = 5;
        ++preIncA;
        System.out.println("preIncA = " + preIncA);

        int preIncB = 5;
        preIncB++;
        System.out.println("preIncB = " + preIncB);
        
        int q1 = 5;
        System.out.println("++q1 * 3 = " + ++q1 * 3);
        q1= 5;
        System.out.println("q1++*3 = " + q1++*3);

        int a = 5;
        --a;
        System.out.println("a = " + a);

        int b = 5;
        b--;
        System.out.println("b = " + b);

        int q2 = 5;
        System.out.println("--q2 * 3 = " + --q2 * 3);
        q2=5;
        System.out.println("q2 * 3 = " + q2-- * 3);


    }
}
