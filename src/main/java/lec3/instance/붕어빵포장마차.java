package lec3.instance;

public class 붕어빵포장마차 {

    public static void main(String[] args) {

        붕어빵 팥붕어빵 = new 붕어빵();
        팥붕어빵.속재료 = "팥";
        팥붕어빵.무슨_붕어빵();

        붕어빵 슈크림붕어빵 = new 붕어빵();
        슈크림붕어빵.속재료 = "슈크림";
        슈크림붕어빵.무슨_붕어빵();

        //인스턴스 멤버변수에 할당하고, 값을 바꾸지 않았기 때문에 값이 유지가 된다. 따로따로 개념이다.
        팥붕어빵.무슨_붕어빵();
    }
}
