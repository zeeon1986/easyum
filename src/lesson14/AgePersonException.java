package lesson14;

public class AgePersonException extends Exception {
    public AgePersonException() {
    }

    public AgePersonException(String message) {
        super(message);
    }

    public AgePersonException(String message, Throwable cause) {
        super(message, cause);
    }

    public AgePersonException(Throwable cause) {
        super(cause);
    }

    public AgePersonException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
