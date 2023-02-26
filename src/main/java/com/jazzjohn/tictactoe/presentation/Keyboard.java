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
        this.moveKeys = new HashMap<>();
        moveKeys.put("1", "3_1");
        moveKeys.put("2", "3_2");
        moveKeys.put("3", "3_3");
        moveKeys.put("4", "2_1");
        moveKeys.put("5", "2_2");
        moveKeys.put("6", "2_3");
        moveKeys.put("7", "1_1");
        moveKeys.put("8", "1_2");
        moveKeys.put("9", "1_3");
    }

    public String inputMove(int playerTurn) {
        System.out.println("Gracz nr " +  playerTurn + " - podaj kolejny ruch (1 - 9):");
        String input = scanner.next();
        return input;
    }

    public String verifyInput(String input) throws IllegalMoveException {
        if(moveKeys.containsKey(input)) {
            return moveKeys.get(input);
        } else {
            throw new IllegalMoveException("illegal move, wrong input");
        }
    }


}
