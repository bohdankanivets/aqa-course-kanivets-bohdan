package com.course.oop.exceptions;

public class IncorrectCardTypeException extends RuntimeException {

    public IncorrectCardTypeException(String errorMessage) {
        super(errorMessage);
    }
}
