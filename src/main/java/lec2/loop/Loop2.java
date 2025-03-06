package lec2.loop;

public class Loop2 {

    public static void main(String[] args) {

        //for
        /*
        for(int i=0; i<10; i++){
            System.out.println("Hello World");
        }
        */

        for(int i=0, j=0; i<10; i++){
            System.out.println("i= "+ i);

            if(i>4){
                j++;
            }

            System.out.println("j= "+ j);
        }

        for(int i=10; i>0; i--){
            System.out.println(i);
        }


    }
}
