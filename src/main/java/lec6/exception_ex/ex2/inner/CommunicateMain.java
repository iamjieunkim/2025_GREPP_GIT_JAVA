package lec6.exception_ex.ex2.inner;

public class CommunicateMain {

    public static void main(String[] args) {
        scene1();
    }

    private static void scene1(){
        LocalPeople localPeople = new LocalPeople();
        ForeignPeople foreignPeople = new ForeignPeople();

        action(localPeople, foreignPeople);

    }

    static void action(People people1, People people2){
        people1.commuicate(people2, "안녕?");
    }
}
