package lec2.operator;

public class RelationalOperator {

    public static void main(String[] args) {

        int a = 10, b=5;

        //a Greater Than b(A가 B보다 크다)
        boolean aGtB = a > b;
        System.out.println("aGtB = " + aGtB);

        //a Less Than b
        boolean aLtb = a < b;
        System.out.println("aLtb = " + aLtb);

        //a greater or equal than b
        boolean aGeB = a >= a;
        System.out.println("aGeB = " + aGeB);

        //a little or equal than b
        boolean aLeB = a <= b;
        System.out.println("aLeB = " + aLeB);

        //a equal b
        boolean aEqb = a == b;
        System.out.println("aEqb = " + aEqb);

        //a not equal b
        boolean aNeb = a!=b;
        System.out.println("aNeb = " + aNeb);
    }
}
