package lec2.Method;

public class MethodEtc {

    //Q1. 숫자(정수) 하나를 매개변수로 받아서
    // 그 숫자가 홀수인지 짝수인지 출력하는 메서드를 정의해서 10을 인자로 부여해서 설정해주세요

    public static void main(String[] args) {
       // solve(10);

        int value = 10;
        solve(getValue(value)); //command+option+m(Method)자동 생성
        //command+option+c(Class)자동 생성
    }



    private static int getValue(int value) {
        return value;
    }

    static void solve(int i) {
        if(i%2==0){
            System.out.println("짝수입니다.");
        }else{
            System.out.println("홀수입니다.");
        }

    }
}
