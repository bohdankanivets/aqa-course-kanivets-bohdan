package com.course.oop.exceptions;

public class IncorrectFullNameException extends RuntimeException {

    public IncorrectFullNameException(String errorMessage) {
        super(errorMessage);
    }

}
