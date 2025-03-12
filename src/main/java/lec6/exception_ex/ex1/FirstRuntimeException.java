package lec6.exception_ex.ex1;

public class FirstRuntimeException extends RuntimeException {
    public FirstRuntimeException() {
    }

    public FirstRuntimeException(String message) {
        super(message);
    }

    public FirstRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public FirstRuntimeException(Throwable cause) {
        super(cause);
    }
}
