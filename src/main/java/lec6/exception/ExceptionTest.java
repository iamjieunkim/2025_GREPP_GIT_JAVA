package lec6.exception;

public class ExceptionTest {

    public static void main(String[] args) {

        int result = test3();
        System.out.println("result = " + result);
        /*
        try{
            test1();
            test2(); //RuntimeException이랑 Exception은 서로 다른 객체이기 때문에 서로 할당을 해줄 수 가 없음,그래서 밑에 새로운 catch로 생성해줌
        } catch (RuntimeException e) {
            System.out.println("Hello World");
        } catch (Exception e){
            System.out.println("1");
        } finally { //finally는 무조건 한번 실행이 되는 거임
            System.out.println("2");
        }*/
    }


    static int test3(){

        try{
            System.out.println("test3-try");
            active1();
            return 1;
        } catch (RuntimeException e) {
            System.out.println("test3-catch");
        } finally {
            System.out.println("test3-finally");
        }
        return 3;
    }

    static void test1(){
        active1();
        active2();
        active1();
    }

    static void active1(){
        throw new RuntimeException("런타임메시지오류");
    }
    static void active2() throws RuntimeException{
        throw new RuntimeException();
    }

    static void test2() throws Exception{
        //active3();

        active4();

    }

    static void active3(){
        //단축키 thr
        //throw new Exception();
    }

    static void active4() throws Exception{
        throw new Exception();
    }


}
