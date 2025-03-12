package lec6.exception_ex.ex2.exception;

public class CouldNotCommunicateException extends RuntimeException {

    public CouldNotCommunicateException() {
    }

    public CouldNotCommunicateException(String message) {
        super(message);
    }

    public CouldNotCommunicateException(String message, Throwable cause) {
        super(message, cause);
    }

    public CouldNotCommunicateException(Throwable cause) {
        super(cause);
    }
}
