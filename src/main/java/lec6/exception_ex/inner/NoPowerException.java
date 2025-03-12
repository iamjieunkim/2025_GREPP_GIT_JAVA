package lec6.exception_ex.inner;

public class NoPowerException extends Exception{

    //일반적으로 예외를 상속받을때 이 4개를 주로 받는다.
    public NoPowerException() {
        super();
    }

    public NoPowerException(String message) {
        super(message);
    }

    public NoPowerException(String message, Throwable cause) {
        super(message, cause);
    }

    public NoPowerException(Throwable cause) {
        super(cause);
    }
}
