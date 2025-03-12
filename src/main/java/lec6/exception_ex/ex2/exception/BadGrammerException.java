package lec6.exception_ex.ex2.exception;

public class BadGrammerException extends RuntimeException {

    public BadGrammerException() {
    }

    public BadGrammerException(String message) {
        super(message);
    }

    public BadGrammerException(String message, Throwable cause) {
        super(message, cause);
    }

    public BadGrammerException(Throwable cause) {
        super(cause);
    }
}
