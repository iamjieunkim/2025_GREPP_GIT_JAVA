package lec6.exception_ex.ex2.exception;

public class AmbiguousVocalException extends RuntimeException {

    public AmbiguousVocalException() {
    }

    public AmbiguousVocalException(String message) {
        super(message);
    }

    public AmbiguousVocalException(String message, Throwable cause) {
        super(message, cause);
    }

    public AmbiguousVocalException(Throwable cause) {
        super(cause);
    }
}
