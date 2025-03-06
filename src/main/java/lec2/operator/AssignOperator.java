package lec2.operator;

public class AssignOperator {

    public static void main(String[] args) {
        int a;

        a=10;
        System.out.println("a = " + a);

        a=20;
        System.out.println("a = " + a);

        //명시적 형변환
        a = (short) 1;

        a = 10;

        a+=1;
        System.out.println("a = " + a);

        a-=1;
        System.out.println("a = " + a);

        a*=2;
        System.out.println("a = " + a);

        a/=2;
        System.out.println("a = " + a);

        a%=2;
        System.out.println("a = " + a);


    }
}
