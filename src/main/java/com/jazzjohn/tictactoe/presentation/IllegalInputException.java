package com.jazzjohn.tictactoe.presentation;

public class IllegalInputException extends RuntimeException {

    public IllegalInputException(final String message) {
        super(message);
    }
}
