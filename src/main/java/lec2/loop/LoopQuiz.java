package lec2.loop;

public class LoopQuiz {

    public static void main(String[] args) {

        //Q.구구단 7단을 출력하세요
        for(int i=1; i<=9; i++){
            System.out.println("7 * " + i + " = " + (7*i));
        }

        //5*5 직사각형 출력
        for(int i=1; i<=5; i++){
            for(int j=1; j<=5; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
