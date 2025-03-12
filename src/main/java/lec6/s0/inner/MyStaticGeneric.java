package lec6.s0.inner;

public class MyStaticGeneric {


    public static <T> String test1(T data){
        System.out.println("data = " + data);

        return "ok";
    }

    public void test2(){
        System.out.println("MyStaticGeneric.test2");
    }

    public static <T> void test3(T data){
        System.out.println("data = " + data);
    }


}
