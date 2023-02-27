package com.jazzjohn.tictactoe.data;

import com.jazzjohn.tictactoe.presentation.RepeatedMoveException;

import java.util.HashMap;
import java.util.Map;

public class MoveData {
    private Map<String, Integer> moveData;     //<position row_column, player number>
    private int playerTurn;

    public MoveData() {
        this.moveData = new HashMap<>();
        this.playerTurn = 1;
    }

    public int getPlayerTurn() {
        return this.playerTurn;
    }

    public void nextTurn() {
        this.playerTurn = this.playerTurn == 1 ? 2 : 1;
    }

    public Boolean moveExists(String key) {
        return moveData.containsKey(key);
    }

    public Integer getMoveValue(String key) {
        return moveData.get(key);
    }

    public void setMoveValue(String key) throws RepeatedMoveException {
        if(moveExists(key)) {
            throw new RepeatedMoveException("illegal move, repeated move");
        } else {
            moveData.put(key, this.playerTurn);
        }
    }

    public Integer getGameStatus(int boardSize, int symbolsRequired) {
        //0 - in progress, 1,2 - win, 3 - draw
        //rows
        for(int i = 1; i <= boardSize; i++) {
            int seriesStart = 1;    //id where current series begins
            for(int j = 1; j <= boardSize; j++) {
                if(seriesStart > boardSize + 1 - symbolsRequired) {
                    break;
                } else if(!moveExists(i + "_" + j)) {
                    seriesStart = j + 1;
                } else if(getMoveValue(i + "_" + j)  != getMoveValue(i + "_" + seriesStart)) {
                    seriesStart = j;
                } else if(j == seriesStart + symbolsRequired - 1) {
                    return getMoveValue(i + "_" + j);
                }
            }
        }
        //columns
        for(int j = 1; j <= boardSize; j++) {
            int seriesStart = 1;    //id where current series begins
            for(int i = 1; i <= boardSize; i++) {
                if(seriesStart > boardSize + 1 - symbolsRequired) {
                    break;
                } else if(!moveExists(i + "_" + j)) {
                    seriesStart = i + 1;
                } else if(getMoveValue(i + "_" + j)  != getMoveValue(seriesStart + "_" + j)) {
                    seriesStart = i;
                } else if(i == seriesStart + symbolsRequired - 1) {
                    return getMoveValue(i + "_" + j);
                }
            }
        }

        //diagonal \ starts from row 1 col 1-6* (* - example value for 10x10)
        for(int i = 1; i <= boardSize + 1 - symbolsRequired; i++){
            int seriesStart = i;    //id where current series begins
            for(int j = seriesStart; j <= boardSize; j++) {
                int row = j - i + 1;
                int col = j;
                int seriesStartRow = seriesStart - i + 1;
                int seriesStartCol = seriesStart;
                if(seriesStart > boardSize + 1 - symbolsRequired) {
                    break;
                } else if(!moveExists(row + "_" + col)) {
                    seriesStart = j + 1;
                } else if(getMoveValue(row + "_" + col)  != getMoveValue(seriesStartRow + "_" + seriesStartCol)) {
                    seriesStart = j;
                } else if(j == seriesStart + symbolsRequired - 1) {
                    return getMoveValue(row + "_" + col);
                }
            }
        }

        //diagonal \ starts from row 2-6* col 1 (* - example value for 10x10)
        for(int i = 2; i <= boardSize + 1 - symbolsRequired; i++){
            int seriesStart = i;    //id where current series begins
            for(int j = seriesStart; j <= boardSize; j++) {
                int row = j;
                int col = j - i + 1;
                int seriesStartRow = seriesStart;
                int seriesStartCol = seriesStart - i + 1;
                if(seriesStart > boardSize + 1 - symbolsRequired) {
                    break;
                } else if(!moveExists(row + "_" + col)) {
                    seriesStart = j + 1;
                } else if(getMoveValue(row + "_" + col)  != getMoveValue(seriesStartRow + "_" + seriesStartCol)) {
                    seriesStart = j;
                } else if(j == seriesStart + symbolsRequired - 1) {
                    return getMoveValue(row + "_" + col);
                }
            }
        }

        //diagonal / starts from row 1 col 6*-10* (* - example value for 10x10)
        for(int i = symbolsRequired; i <= boardSize; i++){
            int seriesStart = boardSize + 1 - i;    //id where current series begins
            for(int j = seriesStart; j <= boardSize; j++) {
                int row = i + j - boardSize;
                int col = boardSize + 1 - j;
                int seriesStartRow = i + seriesStart - boardSize;
                int seriesStartCol = boardSize + 1 - seriesStart;
                if(seriesStart > boardSize + 1 - symbolsRequired) {
                    break;
                } else if(!moveExists(row + "_" + col)) {
                    seriesStart = j + 1;
                } else if(getMoveValue(row + "_" + col)  != getMoveValue(seriesStartRow + "_" + seriesStartCol)) {
                    seriesStart = j;
                } else if(j == seriesStart + symbolsRequired - 1) {
                    return getMoveValue(row + "_" + col);
                }
            }
        }

        //diagonal / starts from row 2-6* col 10* (* - example value for 10x10)
        for(int i = 2; i <= boardSize + 1 - symbolsRequired; i++){
            int seriesStart = i;    //id where current series begins
            for(int j = seriesStart; j <= boardSize; j++) {
                int row = j;
                int col = boardSize + i - j;
                int seriesStartRow = seriesStart;
                int seriesStartCol = boardSize + i - seriesStart;
                if(seriesStart > boardSize + 1 - symbolsRequired) {
                    break;
                } else if(!moveExists(row + "_" + col)) {
                    seriesStart = j + 1;
                } else if(getMoveValue(row + "_" + col)  != getMoveValue(seriesStartRow + "_" + seriesStartCol)) {
                    seriesStart = j;
                } else if(j == seriesStart + symbolsRequired - 1) {
                    return getMoveValue(row + "_" + col);
                }
            }
        }

        //draw
        for(int i = 1; i <= boardSize; i++) {
            for(int j = 1; j <= boardSize; j++) {
                if(!moveExists(i + "_" + j)) {
                    return 0;
                } else if(i == boardSize && j == boardSize) {
                    return 3;
                }
            }
        }

        //in progress
        return 0;
    }

}