package com.jazzjohn.tictactoe;

import com.jazzjohn.tictactoe.data.MoveData;
import com.jazzjohn.tictactoe.presentation.Board;
import com.jazzjohn.tictactoe.presentation.IllegalInputException;
import com.jazzjohn.tictactoe.presentation.Keyboard;
import com.jazzjohn.tictactoe.presentation.RepeatedMoveException;

import java.util.Random;


public class TicTacToeApplication {

    public static void main(String[] args) {
        int boardChoice = 0;
        Board board;
        MoveData moveData = new MoveData();
        Keyboard keyboard = new Keyboard();
        String nextMove;
        int gameStatus = 0;
        Random random = new Random();

        //board size choice
        System.out.println("Wybierz wariant gry:\n1 - standardowa (plansza 3x3, 3 symbole w linii)\n2 - powiekszona (plansza 10x10, 5 symboli w linii)");
        while(boardChoice == 0) {
            try {
                boardChoice = keyboard.inputBoardSize();
            } catch (IllegalInputException e) {
                System.out.println("!!! Wybrano nieistniejacy wariant. Wybierz jedna z podanych opcji.");
            }
        }
        board = new Board(boardChoice);
        keyboard.initMoveKeys(board.getBoardSize());
        board.printBoard(moveData);

        //gameplay
        while(gameStatus == 0) {
            if(moveData.getPlayerTurn() == 1) {
                //player move
                try {
                    System.out.println("Gracz nr " +  moveData.getPlayerTurn() + " - podaj kolejny ruch (wiersz-kolumna, np. 1-5):");
                    nextMove = keyboard.inputMove(moveData.getPlayerTurn());
                    nextMove = keyboard.verifyInput(nextMove);
                    moveData.setMoveValue(nextMove);
                } catch (IllegalInputException e) {
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
                    board.printBoard(moveData);
                } catch (RepeatedMoveException e) {
                    continue;
                }
            }

            //check if game ended
            gameStatus =  moveData.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
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