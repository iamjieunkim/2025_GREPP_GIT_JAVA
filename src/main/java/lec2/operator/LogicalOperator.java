package lec2.operator;

public class LogicalOperator {

    public static void main(String[] args) {

        boolean iamTrue = true;
        boolean iamFalse = false;

        //&&는 전부참
        boolean andResult1 = iamTrue && iamFalse;
        System.out.println("andResult1 = " + andResult1);

        boolean andResult2 = iamFalse && iamTrue;
        System.out.println("andResult2 = " + andResult2);

        boolean andResult3 = iamFalse && iamFalse;
        System.out.println("andResult3 = " + andResult3);

        boolean andResult4 = iamTrue && iamTrue;
        System.out.println("andResult4 = " + andResult4);

        //||
        boolean orResult1 = iamTrue || iamFalse;
        System.out.println("orResult1 = " + orResult1);

        boolean orResult2 = iamFalse || iamTrue;
        System.out.println("orResult2 = " + orResult2);

        boolean orResult3 = iamFalse || iamFalse;
        System.out.println("orResult3 = " + orResult3);

        boolean orResult4 = iamTrue || iamTrue;
        System.out.println("orResult4 = " + orResult4);


    }
}
