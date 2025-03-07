package lec3.encapsulation;

public class Encapsulation2 {

    private String name;
    private int age;
    private String schoolname;
    private int grade;

    public Encapsulation2(String name, int age, String schoolname, int grade) {
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


    //예외적으로 바꾸고 싶은 사항이 있을때,전부다 캡슐화 해놓고 무언가를 셋팅하고 싶을 때 사용함
    //EncMain2에서 name만 다시 셋팅하고 싶은거 이기 때문에 setter사용
    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
