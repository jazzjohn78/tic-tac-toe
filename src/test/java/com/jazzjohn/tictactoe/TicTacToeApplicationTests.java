package com.jazzjohn.tictactoe;

import com.jazzjohn.tictactoe.data.MoveData;
import com.jazzjohn.tictactoe.presentation.Board;
import com.jazzjohn.tictactoe.presentation.IllegalInputException;
import com.jazzjohn.tictactoe.presentation.Keyboard;
import com.jazzjohn.tictactoe.presentation.RepeatedMoveException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacToeApplicationTests {

    @Nested
    @DisplayName("tests for 3x3")
    class Test3x3 {
        @Test
        void test3x3WinPlayer1Rows() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //row 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            //row 2
            moveData2.setMoveValue("2_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_1");
            //row 3
            moveData3.setMoveValue("3_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_3");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(1, gameStatus1);
            assertEquals(1, gameStatus2);
            assertEquals(1, gameStatus3);
        }

        @Test
        void test3x3WinPlayer2Rows() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();;
            MoveData moveData3 = new MoveData();

            //When
            //row 1
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            //row 2
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_1");
            //row 3
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_3");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(2, gameStatus1);
            assertEquals(2, gameStatus2);
            assertEquals(2, gameStatus3);
        }

        @Test
        void test3x3WinPlayer1Columns() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //column 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            //column 2
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_2");
            //column 3
            moveData3.setMoveValue("3_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(1, gameStatus1);
            assertEquals(1, gameStatus2);
            assertEquals(1, gameStatus3);
        }

        @Test
        void test3x3WinPlayer2Columns() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();;
            MoveData moveData3 = new MoveData();

            //When
            //column 1
            moveData1.setMoveValue("2_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            //column 2
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            //column 3
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(2, gameStatus1);
            assertEquals(2, gameStatus2);
            assertEquals(2, gameStatus3);
        }

        @Test
        void test3x3WinPlayer1Diagonals() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();

            //When
            //diagonal 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            //diagonal 2
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_1");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(1, gameStatus1);
            assertEquals(1, gameStatus2);
        }

        @Test
        void test3x3WinPlayer2Diagonals() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();

            //When
            //diagonal 1
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            //diagonal 2
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_1");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(2, gameStatus1);
            assertEquals(2, gameStatus2);
        }

        @Test
        void test3x3Draws() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //draw 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_2");
            //draw 2
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_3");
            //draw 3
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_2");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(3, gameStatus1);
            assertEquals(3, gameStatus2);
            assertEquals(3, gameStatus3);
        }

        @Test
        void test3x3InProgress() {
            //Given
            Board board = new Board(3);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //progress 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            moveData1.nextTurn();
            //progress 2
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_1");
            moveData2.nextTurn();
            //progress 3
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_3");
            moveData3.nextTurn();
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(0, gameStatus1);
            assertEquals(0, gameStatus2);
            assertEquals(0, gameStatus3);
        }

        @Test
        void test3x3ThrowRepeatedMoveException() {
            //Given
            Board board = new Board(3);
            MoveData moveData = new MoveData();

            //When & Then
            RepeatedMoveException exceptionThrown = Assertions.assertThrows(RepeatedMoveException.class, () -> {
                moveData.setMoveValue("1_1");
                moveData.nextTurn();
                moveData.setMoveValue("1_2");
                moveData.nextTurn();
                moveData.setMoveValue("1_3");
                moveData.nextTurn();
                moveData.setMoveValue("1_2");
            }, "RepeatedMoveException was expected");
            Assertions.assertEquals("illegal move, repeated move", exceptionThrown.getMessage());
        }

        @Test
        void test3x3ThrowIllegalMoveException() {
            //Given
            Keyboard keyboard = new Keyboard();
            keyboard.initMoveKeys(3);

            //When & Then
            IllegalInputException exceptionThrown = Assertions.assertThrows(IllegalInputException.class, () -> {
                String move =  keyboard.verifyInput("abc");
            }, "IllegalInputException was expected");
            Assertions.assertEquals("illegal move, wrong input", exceptionThrown.getMessage());
        }
    }

    @Nested
    @DisplayName("tests for 10x10")
    class Test10x10 {
        @Test
        void testWinPlayer1Rows() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //row 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_5");
            //row 4
            moveData2.setMoveValue("4_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_5");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_7");
            //row 10
            moveData3.setMoveValue("10_9");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_5");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_7");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_6");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_4");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_8");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(1, gameStatus1);
            assertEquals(1, gameStatus2);
            assertEquals(1, gameStatus3);
        }

        @Test
        void testWinPlayer2Rows() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //row 1
            moveData1.setMoveValue("10_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_5");
            //row 4
            moveData2.setMoveValue("10_10");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_5");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("4_7");
            //row 10
            moveData3.setMoveValue("10_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_9");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_5");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_7");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_6");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_4");
            moveData3.nextTurn();
            moveData3.setMoveValue("10_8");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(2, gameStatus1);
            assertEquals(2, gameStatus2);
            assertEquals(2, gameStatus3);
        }

        @Test
        void testWinPlayer1Columns() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //column 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_1");
            //column 6
            moveData2.setMoveValue("10_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("9_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("8_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("7_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("6_6");
            //column 10
            moveData3.setMoveValue("5_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("6_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("7_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("4_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_4");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_10");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(1, gameStatus1);
            assertEquals(1, gameStatus2);
            assertEquals(1, gameStatus3);
        }

        @Test
        void testWinPlayer2Columns() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //column 1
            moveData1.setMoveValue("10_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_1");
            //column 6
            moveData2.setMoveValue("10_10");
            moveData2.nextTurn();
            moveData2.setMoveValue("10_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("9_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("8_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("7_6");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("6_6");
            //column 10
            moveData3.setMoveValue("5_5");
            moveData3.nextTurn();
            moveData3.setMoveValue("5_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("6_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("7_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("4_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_4");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_10");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(2, gameStatus1);
            assertEquals(2, gameStatus2);
            assertEquals(2, gameStatus3);
        }

        @Test
        void testWinPlayer1Diagonals() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();
            MoveData moveData4 = new MoveData();
            MoveData moveData5 = new MoveData();
            MoveData moveData6 = new MoveData();

            //When
            //diagonal 1 \
            moveData1.setMoveValue("4_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_8");
            //diagonal 2 \
            moveData2.setMoveValue("10_5");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("9_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("8_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("7_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("6_1");
            //diagonal 3 \
            moveData3.setMoveValue("1_6");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_7");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_8");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("4_9");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_4");
            moveData3.nextTurn();
            moveData3.setMoveValue("5_10");
            //diagonal 4 /
            moveData4.setMoveValue("6_6");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_1");
            moveData4.nextTurn();
            moveData4.setMoveValue("5_7");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_2");
            moveData4.nextTurn();
            moveData4.setMoveValue("4_8");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_3");
            moveData4.nextTurn();
            moveData4.setMoveValue("7_5");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_4");
            moveData4.nextTurn();
            moveData4.setMoveValue("8_4");
            //diagonal 5 /
            moveData5.setMoveValue("1_5");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_1");
            moveData5.nextTurn();
            moveData5.setMoveValue("2_4");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_2");
            moveData5.nextTurn();
            moveData5.setMoveValue("3_3");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_3");
            moveData5.nextTurn();
            moveData5.setMoveValue("4_2");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_4");
            moveData5.nextTurn();
            moveData5.setMoveValue("5_1");
            //diagonal 6 /
            moveData6.setMoveValue("10_6");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_1");
            moveData6.nextTurn();
            moveData6.setMoveValue("9_7");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_2");
            moveData6.nextTurn();
            moveData6.setMoveValue("8_8");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_3");
            moveData6.nextTurn();
            moveData6.setMoveValue("7_9");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_4");
            moveData6.nextTurn();
            moveData6.setMoveValue("6_10");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus4 = moveData4.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus5 = moveData5.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus6 = moveData6.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(1, gameStatus1);
            assertEquals(1, gameStatus2);
            assertEquals(1, gameStatus3);
            assertEquals(1, gameStatus4);
            assertEquals(1, gameStatus5);
            assertEquals(1, gameStatus6);
        }

        @Test
        void testWinPlayer2Diagonals() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();
            MoveData moveData4 = new MoveData();
            MoveData moveData5 = new MoveData();
            MoveData moveData6 = new MoveData();

            //When
            //diagonal 1 \
            moveData1.setMoveValue("10_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_8");
            //diagonal 2 \
            moveData2.setMoveValue("10_10");
            moveData2.nextTurn();
            moveData2.setMoveValue("10_5");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("9_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("8_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("7_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_4");
            moveData2.nextTurn();
            moveData2.setMoveValue("6_1");
            //diagonal 3 \
            moveData3.setMoveValue("10_10");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_6");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_7");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_8");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("4_9");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_4");
            moveData3.nextTurn();
            moveData3.setMoveValue("5_10");
            //diagonal 4 /
            moveData4.setMoveValue("10_10");
            moveData4.nextTurn();
            moveData4.setMoveValue("6_6");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_1");
            moveData4.nextTurn();
            moveData4.setMoveValue("5_7");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_2");
            moveData4.nextTurn();
            moveData4.setMoveValue("4_8");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_3");
            moveData4.nextTurn();
            moveData4.setMoveValue("7_5");
            moveData4.nextTurn();
            moveData4.setMoveValue("1_4");
            moveData4.nextTurn();
            moveData4.setMoveValue("8_4");
            //diagonal 5 /
            moveData5.setMoveValue("10_10");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_5");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_1");
            moveData5.nextTurn();
            moveData5.setMoveValue("2_4");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_2");
            moveData5.nextTurn();
            moveData5.setMoveValue("3_3");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_3");
            moveData5.nextTurn();
            moveData5.setMoveValue("4_2");
            moveData5.nextTurn();
            moveData5.setMoveValue("1_4");
            moveData5.nextTurn();
            moveData5.setMoveValue("5_1");
            //diagonal 6 /
            moveData6.setMoveValue("10_10");
            moveData6.nextTurn();
            moveData6.setMoveValue("10_6");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_1");
            moveData6.nextTurn();
            moveData6.setMoveValue("9_7");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_2");
            moveData6.nextTurn();
            moveData6.setMoveValue("8_8");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_3");
            moveData6.nextTurn();
            moveData6.setMoveValue("7_9");
            moveData6.nextTurn();
            moveData6.setMoveValue("1_4");
            moveData6.nextTurn();
            moveData6.setMoveValue("6_10");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus4 = moveData4.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus5 = moveData5.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus6 = moveData6.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(2, gameStatus1);
            assertEquals(2, gameStatus2);
            assertEquals(2, gameStatus3);
            assertEquals(2, gameStatus4);
            assertEquals(2, gameStatus5);
            assertEquals(2, gameStatus6);
        }

        @Test
        void testDraws() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();

            //When
            //draw 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("4_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("6_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("5_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("7_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("8_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("9_9");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_10");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_4");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_5");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_6");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_7");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_8");
            moveData1.nextTurn();
            moveData1.setMoveValue("10_9");
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(3, gameStatus1);
        }

        @Test
        void testInProgress() {
            //Given
            Board board = new Board(10);
            MoveData moveData1 = new MoveData();
            MoveData moveData2 = new MoveData();
            MoveData moveData3 = new MoveData();

            //When
            //progress 1
            moveData1.setMoveValue("1_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("1_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_2");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_1");
            moveData1.nextTurn();
            moveData1.setMoveValue("2_3");
            moveData1.nextTurn();
            moveData1.setMoveValue("3_3");
            moveData1.nextTurn();
            //progress 2
            moveData2.setMoveValue("1_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("1_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_1");
            moveData2.nextTurn();
            moveData2.setMoveValue("2_3");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_2");
            moveData2.nextTurn();
            moveData2.setMoveValue("3_1");
            moveData2.nextTurn();
            //progress 3
            moveData3.setMoveValue("1_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("1_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_3");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_1");
            moveData3.nextTurn();
            moveData3.setMoveValue("2_2");
            moveData3.nextTurn();
            moveData3.setMoveValue("3_3");
            moveData3.nextTurn();
            int gameStatus1 = moveData1.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus2 = moveData2.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());
            int gameStatus3 = moveData3.getGameStatus(board.getBoardSize(), board.getSymbolsRequired());

            //Then
            assertEquals(0, gameStatus1);
            assertEquals(0, gameStatus2);
            assertEquals(0, gameStatus3);
        }

        @Test
        void testThrowRepeatedMoveException() {
            //Given
            Board board = new Board(10);
            MoveData moveData = new MoveData();

            //When & Then
            RepeatedMoveException exceptionThrown = Assertions.assertThrows(RepeatedMoveException.class, () -> {
                moveData.setMoveValue("10_1");
                moveData.nextTurn();
                moveData.setMoveValue("10_2");
                moveData.nextTurn();
                moveData.setMoveValue("10_3");
                moveData.nextTurn();
                moveData.setMoveValue("10_2");
            }, "RepeatedMoveException was expected");
            Assertions.assertEquals("illegal move, repeated move", exceptionThrown.getMessage());
        }

        @Test
        void testThrowIllegalMoveException() {
            //Given
            Keyboard keyboard = new Keyboard();
            keyboard.initMoveKeys(10);

            //When & Then
            IllegalInputException exceptionThrown = Assertions.assertThrows(IllegalInputException.class, () -> {
                String move2 =  keyboard.verifyInput("abc");
            }, "IllegalInputException was expected");

            //Then
            assertEquals("illegal move, wrong input", exceptionThrown.getMessage());
        }

    }
}