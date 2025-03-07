package lec3.encapsulation;

public class Encapsulation3 {

    private String name;
    private int age;
    private String schoolname;
    private int grade;

    public Encapsulation3(String name, int age, String schoolname, int grade) {
        this.name = name;
        this.age = age;
        this.schoolname = schoolname;
        this.grade = grade;
    }

    //읽고 쓰기 한번에 하는 방법 Getter and Setter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchoolname() {
        return schoolname;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
