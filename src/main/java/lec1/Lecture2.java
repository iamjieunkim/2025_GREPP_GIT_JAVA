package lec1;

public class Lecture2 {

    //psvm
    public static void main(String[] args) {

        // -128~127 byte
        byte tinyNumber1 = 127;
        byte tinyNumber2 = -128;
        //byte tinyNumber3 = 128;

        short cuteNumber1 = 32767;
        short cuteNumber2 = -32767;
        //short  cuteNumber3 = 32768;

        int generalNumber1 = 2_147_483_647;
        int generalNumber2 = -2_147_483_648;
        //int generalNumber3 = 2_147_483_650; 범위 초과 오류 발생

        int tenDecimal = 10; //10진수
        int tenBinary = 0b1010; //2진수
        int tenOctal = 0b1000_0000; //8진수
        int tenOctal2 = 012; //8진수
        int tenHexadecimal = 0b0100_0000; //16진수
        int tenHexadecimal2 = 0xA; //16진수

        long hugeNumber1 = -9223372036854775808L;
        long hugeNumber2 = 9223372036854775807L;
        //long hugeNumber3 = 9223372036854775808L; 범위 초과 오류 발생
    }
}
