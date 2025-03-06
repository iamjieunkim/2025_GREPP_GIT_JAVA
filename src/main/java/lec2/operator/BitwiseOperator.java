package lec2.operator;

public class BitwiseOperator {

    public static void main(String[] args) {
        int e = 0b01010;
        int f = 0b0011;
        int result = e ^ f;
        System.out.println("result = " + result);
    }

}
