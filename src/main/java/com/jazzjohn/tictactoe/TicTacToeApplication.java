package com.jazzjohn.tictactoe;

import com.jazzjohn.tictactoe.data.MoveData;
import com.jazzjohn.tictactoe.presentation.Board;
import com.jazzjohn.tictactoe.presentation.IllegalMoveException;
import com.jazzjohn.tictactoe.presentation.Keyboard;
import com.jazzjohn.tictactoe.presentation.RepeatedMoveException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;


public class TicTacToeApplication {

    public static void main(String[] args) {
        Board board = new Board(3);
        MoveData moveData = new MoveData();
        Keyboard keyboard = new Keyboard();
        String nextMove;
        int gameStatus = 0;

        //gameplay
        //for(int i = 1; i <= board.getBoardSize() * board.getBoardSize(); i++) {
        while(gameStatus == 0) {
            board.printBoard(moveData);
            try {
                nextMove = keyboard.inputMove(moveData.getPlayerTurn());
                nextMove = keyboard.verifyInput(nextMove);
                moveData.setMoveValue(nextMove);
                //check if game ended
                gameStatus =  moveData.getGameStatus(board.getBoardSize());
                if(gameStatus == 0) {
                    moveData.nextTurn();
                } else if(gameStatus == 3) {
                    board.printBoard(moveData);
                    System.out.println("Koniec gry - remis.");
                    System.out.println("-----------------------------");
                } else {
                    board.printBoard(moveData);
                    System.out.println("Koniec gry - gracz nr " + gameStatus + " wygral, gratuluje!");
                    System.out.println("-----------------------------");
                }

            } catch (IllegalMoveException e) {
                System.out.println("!!! Podana pozycja nie jest nieprawidlowa. Upewnij się, ze wprowadzasz dane zgodnie z instrukcja.");
            } catch (RepeatedMoveException e) {
                System.out.println("!!! Podane miejsce jest już zajete, podaj pozycje wolnego pola.");
            }

        }
    }

}
