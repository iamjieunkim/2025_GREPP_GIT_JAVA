package lec3.encapsulation;

public class EncMain2 {

    public static void main(String[] args) {

        //Encapsulation zhangkun = new Encapsulation("장곤", 25, "서안 교통대학교", 3);
        Encapsulation2 friend = new Encapsulation2("장곤", 25, "서안 교통대학교", 3);


        System.out.println("이름 변경 전, friend.name = " + friend.getName());

        friend.setName("팽흠");

        System.out.println("이름 변경 후, friend.name = " + friend.getName());
    }
}
