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

    public Integer getGameStatus(int boardSize) {
        //0 - in progress, 1,2 - win, 3 - draw
        //rows
        for(int i = 1; i <= boardSize; i++) {
            for(int j = 1; j <= boardSize; j++) {
                if(!moveExists(i + "_" + j)  ||  getMoveValue(i + "_" + j)  != getMoveValue(i + "_" + 1)) {
                    break;
                } else if(j == boardSize) {
                    return getMoveValue(i + "_" + 1);
                }
            }
        }
        //columns
        for(int j = 1; j <= boardSize; j++) {
            for(int i = 1; i <= boardSize; i++) {
                if(!moveExists(i + "_" + j)  ||  getMoveValue(i + "_" + j)  != getMoveValue(1 + "_" + j)) {
                    break;
                } else if(i == boardSize) {
                    return getMoveValue(1 + "_" + j);
                }
            }
        }
        //diagonal 1
        for(int i = 1; i <= boardSize; i++) {
            if(!moveExists(i + "_" + i)  ||  getMoveValue(i + "_" + i)  != getMoveValue(1 + "_" + 1)) {
                break;
            } else if(i == boardSize) {
                return getMoveValue(1 + "_" + 1);
            }
        }
        //diagonal 2
        for(int i = 1; i <= boardSize; i++) {
            if(!moveExists(i + "_" + (boardSize - i + 1))  ||  getMoveValue(i + "_" + (boardSize - i + 1))  != getMoveValue(1 + "_" + (boardSize))) {
                break;
            } else if(i == boardSize) {
                return getMoveValue(1 + "_" + (boardSize));
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

        return 0;
    }

}
