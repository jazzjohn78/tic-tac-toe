package com.jazzjohn.tictactoe.presentation;

import com.jazzjohn.tictactoe.data.MoveData;

public final class Board {
    private final int boardSize;
    private final String player1Symbol = "O";
    private final String player2Symbol = "X";

    public Board(final int boardSize) {
        this.boardSize = boardSize;
    }

    public int getBoardSize() {
        return boardSize;
    }

    public void printBoard(MoveData moveData) {
        String result = "\n";
        for(int i = 1; i <= boardSize; i++) {
            for(int j = 1; j <= boardSize; j++) {
                String moveKey = i + "_" + j;
                result += "|";
                if(moveData.moveExists(moveKey)) {
                    int moveValue = moveData.getMoveValue(moveKey);
                    if(moveValue == 1) {
                        result += player1Symbol;
                    } else {
                        result += player2Symbol;
                    }
                } else {
                    result += " ";
                }
            }
            result += "|\n";
        }
        System.out.println(result);
    }
}
