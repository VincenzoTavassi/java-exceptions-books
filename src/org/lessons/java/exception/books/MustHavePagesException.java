package org.lessons.java.exception.books;

public class MustHavePagesException extends RuntimeException {
    public MustHavePagesException(String message) {
        super(message);
    }
}
