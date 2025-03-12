package lec6.exception_ex.ex1;

public class SecondRuntimeException extends RuntimeException {
    public SecondRuntimeException() {
    }

    public SecondRuntimeException(String message) {
        super(message);
    }

    public SecondRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public SecondRuntimeException(Throwable cause) {
        super(cause);
    }
}
