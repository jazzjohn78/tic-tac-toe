package com.jazzjohn.tictactoe;

import com.jazzjohn.tictactoe.data.MoveData;
import com.jazzjohn.tictactoe.presentation.Board;
import com.jazzjohn.tictactoe.presentation.IllegalMoveException;
import com.jazzjohn.tictactoe.presentation.Keyboard;
import com.jazzjohn.tictactoe.presentation.RepeatedMoveException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TicTacToeApplicationTests {

    @Test
    void test3x3WinPlayer1Rows() {
        //Given
        Board board = new Board(3);
        MoveData moveData1 = new MoveData();
        MoveData moveData2 = new MoveData();
        MoveData moveData3 = new MoveData();

        //When
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());
        int gameStatus3 = moveData3.getGameStatus(board.getBoardSize());

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
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());
        int gameStatus3 = moveData3.getGameStatus(board.getBoardSize());

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
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());
        int gameStatus3 = moveData3.getGameStatus(board.getBoardSize());

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
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());
        int gameStatus3 = moveData3.getGameStatus(board.getBoardSize());

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
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());

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
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());

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
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());
        int gameStatus3 = moveData3.getGameStatus(board.getBoardSize());

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
        try {
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
        } catch (RepeatedMoveException e) {

        }
        int gameStatus1 = moveData1.getGameStatus(board.getBoardSize());
        int gameStatus2 = moveData2.getGameStatus(board.getBoardSize());
        int gameStatus3 = moveData3.getGameStatus(board.getBoardSize());

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
        Boolean exceptionThrown = false;

        //When
        try {
            moveData.setMoveValue("1_1");
            moveData.nextTurn();
            moveData.setMoveValue("1_2");
            moveData.nextTurn();
            moveData.setMoveValue("1_3");
            moveData.nextTurn();
            moveData.setMoveValue("1_2");
        } catch (RepeatedMoveException e) {
            exceptionThrown = true;
        }

        //Then
        assertEquals(true, exceptionThrown);
    }

    @Test
    void test3x3ThrowIllegalMoveException() {
        //Given
        Keyboard keyboard = new Keyboard();
        Boolean exceptionThrown1 = false;
        Boolean exceptionThrown2 = false;

        //When
        try {
            String move1 =  keyboard.verifyInput("3");
        } catch (IllegalMoveException e) {
            exceptionThrown1 = true;
        }
        try {
            String move2 =  keyboard.verifyInput("abc");
        } catch (IllegalMoveException e) {
            exceptionThrown2 = true;
        }

        //Then
        assertEquals(false, exceptionThrown1);
        assertEquals(true, exceptionThrown2);
    }
}
