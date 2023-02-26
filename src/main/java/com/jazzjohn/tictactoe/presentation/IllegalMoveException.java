package com.jazzjohn.tictactoe.presentation;

public class IllegalMoveException extends Exception {

    public IllegalMoveException(final String message) {
        super(message);
    }
}
