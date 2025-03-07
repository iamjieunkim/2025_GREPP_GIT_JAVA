package lec3.instance;

public class InstanceBluePrintMain {

    public static void main(String[] args) {
        test1();
    }

    private static void test1(){
        InstanceBluePrint test1 = new InstanceBluePrint();

        String ins1Field = test1.field1;
        int ins2Field = test1.field2;

        System.out.println("ins1Field = " + ins1Field);
        System.out.println("ins2Field = " + ins2Field);

        test1.method1();
        test1.method2();

        ins1Field = "field2";
        ins2Field = 3;

        System.out.println("ins1Field = " + ins1Field);
        System.out.println("ins2Field = " + ins2Field);


        test1.method1();
        test1.method2();
    }

}
