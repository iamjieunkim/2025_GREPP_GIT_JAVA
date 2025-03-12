package lec6.s1;

import java.util.Objects;

public class Box<T> {

    //Box의 기능 null이라는 것에서 자유로워 싶어져서 만드는 클래스
    //null로 부터 자유롭게, 널이면 나 비었어~이렇게 알려주게 만드는것

    //무조건 private이여야 한다. 왜냐면null로 부터 자유로워 질려면 아무도 접근하지 못하게 해서 null값으로 변경 할 수 없도록 만들어야 되기 때문에
    private final T data;

    private Box(T data) {
        this.data = data;
    }

    public static <T> Box<T> empty(){
        return new Box<>(null);
    }

    //<T>으로 받고 반환은 Box<T> 이름은 of
    public static <T> Box<T> of(T value) {
        /*
        if(value == null){
            throw new NullPointerException();
        }
        */
        //위에랑 Objects.requireNonNull(value)얘랑은 같은 말이다.
        return new Box<>(Objects.requireNonNull(value));
        //그리고 이렇게 하면 값이 보장된 인스턴스를 하나는 만들 수 있다.
    }

    public static <T> Box<T> ofNullable(T value) {
        //외부에서 값을 받아올때, 처리하는 내용
        return value == null ? new Box<>(null) : new Box<>(value);
    }

    public T get() {
        if(data == null){
            throw new NoSuchElementException("No value present");
        }
        return data;
    }

    //isPresent안에 뭐가 있습니까? 이거임
    public boolean isPresent() {
        return data != null;
    }

    //박스님 안에 비었나요? 확인하는 거
    public boolean isEmpty() {
        return data == null;
    }



}
