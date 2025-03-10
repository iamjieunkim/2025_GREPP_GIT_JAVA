package lec4.extend_example.inner;

import lec4.extend_example.ExtendClass;

//상속을 받는 클래스는 옆에다 extends를 쓰고 상속받는 클래스 이름을 적어주기
public class SubClass extends BaseClass {

    public SubClass(String name, String nickname) {
        this.name = name;
        this.nickname = nickname;
        //얘는 private이라 안됨this.uniqueName =;
    }

    public SubClass() {

    }
}
