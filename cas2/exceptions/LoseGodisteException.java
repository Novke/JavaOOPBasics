package org.example.cas2.exceptions;

public class LoseGodisteException extends RuntimeException{

    public LoseGodisteException() {
    }

    public LoseGodisteException(String message) {
        super(message);
    }

    public LoseGodisteException(String message, Throwable cause) {
        super(message, cause);
    }

    public LoseGodisteException(Throwable cause) {
        super(cause);
    }
}
