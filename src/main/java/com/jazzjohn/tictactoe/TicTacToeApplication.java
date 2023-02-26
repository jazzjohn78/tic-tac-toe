package com.jazzjohn.tictactoe;

import com.jazzjohn.tictactoe.data.MoveData;
import com.jazzjohn.tictactoe.presentation.Board;
import com.jazzjohn.tictactoe.presentation.IllegalMoveException;
import com.jazzjohn.tictactoe.presentation.Keyboard;
import com.jazzjohn.tictactoe.presentation.RepeatedMoveException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Random;
import java.util.Scanner;


public class TicTacToeApplication {

    public static void main(String[] args) {
        Board board = new Board(3);
        MoveData moveData = new MoveData();
        Keyboard keyboard = new Keyboard();
        String nextMove;
        int gameStatus = 0;
        Random random = new Random();

        //gameplay
        while(gameStatus == 0) {
            if(moveData.getPlayerTurn() == 1) {
                board.printBoard(moveData);
                //player move
                try {
                    nextMove = keyboard.inputMove(moveData.getPlayerTurn());
                    nextMove = keyboard.verifyInput(nextMove);
                    moveData.setMoveValue(nextMove);
                } catch (IllegalMoveException e) {
                    System.out.println("!!! Podana pozycja nie jest nieprawidlowa. Upewnij się, ze wprowadzasz dane zgodnie z instrukcja.");
                    continue;
                } catch (RepeatedMoveException e) {
                    System.out.println("!!! Podane miejsce jest już zajete, podaj pozycje wolnego pola.");
                    continue;
                }
            } else {
                //computer move
                int row = random.nextInt(board.getBoardSize()) + 1;
                int column = random.nextInt(board.getBoardSize()) + 1;
                try {
                    moveData.setMoveValue(row + "_" + column);
                } catch (RepeatedMoveException e) {
                    continue;
                }
            }

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

        }

    }

}
