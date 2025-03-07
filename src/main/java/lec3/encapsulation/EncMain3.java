package lec3.encapsulation;

public class EncMain3 {

    public static void main(String[] args) {

        //Encapsulation zhangkun = new Encapsulation("장곤", 25, "서안 교통대학교", 3);
        Encapsulation3 friend = new Encapsulation3("장곤", 25, "서안 교통대학교", 3);


        System.out.println("이름 변경 전, friend.name = " + friend.getName());
        System.out.println("학교 이름 변경 전, friend.schoolname = " + friend.getSchoolname());

        friend.setName("팽흠");
        friend.setSchoolname("칭화대");
        
        System.out.println("이름 변경 후, friend.name = " + friend.getName());
        System.out.println("학교 이름 변경 전, friend.schoolname = " + friend.getSchoolname());
    }
}
