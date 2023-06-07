package org.lessons.java.exception.books;

public class EmptyStringException extends RuntimeException {
    public EmptyStringException(String message) {
        super(message);
    }
}
