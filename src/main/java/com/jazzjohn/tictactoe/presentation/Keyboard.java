package com.jazzjohn.tictactoe.presentation;

import com.jazzjohn.tictactoe.data.MoveData;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public final class Keyboard {
    Scanner scanner;
    Map<String, String> moveKeys;

    public Keyboard() {
        this.scanner = new Scanner(System.in);
    }

    public void initMoveKeys(int boardSize) {
        this.moveKeys = new HashMap<>();
        for(int i = 1; i <= boardSize; i++) {
            for (int j = 1; j <= boardSize; j++) {
                moveKeys.put(i + "-" + j, i + "_" + j);
            }
        }
    }

    public String inputMove(int playerTurn) {
        String input = scanner.next();
        return input;
    }

    public String verifyInput(String input) throws IllegalInputException {
        if(moveKeys.containsKey(input)) {
            return moveKeys.get(input);
        } else {
            throw new IllegalInputException("illegal move, wrong input");
        }
    }

    public int inputBoardSize() throws IllegalInputException {
        String input = scanner.next();
        if(input.equals("1")) {
            return 3;
        } else if(input.equals("2")) {
            return 10;
        } else {
            throw new IllegalInputException("wrong board size");
        }
    }
}