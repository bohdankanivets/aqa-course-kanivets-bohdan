package com.course.oop.exceptions;

public class IncorrectRoleException extends RuntimeException {

    public IncorrectRoleException(String errorMessage) {
        super(errorMessage);
    }
}
