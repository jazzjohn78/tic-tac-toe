package com.jazzjohn.tictactoe.presentation;

public class RepeatedMoveException extends RuntimeException {

    public RepeatedMoveException(final String message) {
        super(message);
    }
}
