package lec3.encapsulation;

public class EncMain1 {

    public static void main(String[] args) {

        Encapsulation zhangkun = new Encapsulation("장곤", 25, "서안 교통대학교", 3);

        /*
        private이기 때문에 직접적으로 참고 할 수 가 없다.
        System.out.println("zhangkun.name = " + zhangkun.name);

        zhangkun.name="팽흠";
        System.out.println("zhangkun.name = " + zhangkun.name);
         */

        //이렇게 접근을 하지 못할때 사용할 수 있는거(밖에 꺼내 쓰고 싶을때 사용하는 것) -> getter
        System.out.println("이름 변경 전, zhangkun.name = " + zhangkun.getName());
    }
}
