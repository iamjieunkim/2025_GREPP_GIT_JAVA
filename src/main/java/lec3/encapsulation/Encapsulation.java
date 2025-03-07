package lec3.encapsulation;

public class Encapsulation {

    private String name;
    private int age;
    private String schoolname;
    private int grade;

    public Encapsulation(String name, int age, String schoolname, int grade) {
        this.name = name;
        this.age = age;
        this.schoolname = schoolname;
        this.grade = grade;
    }

    //꺼내는거 Getter(집어 넣어져있는 name을 사용하기 위해서 getter 사용)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public int getGrade() {
        return grade;
    }
}
