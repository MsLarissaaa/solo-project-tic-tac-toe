package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BoardTest {

    private PrintStream printStream;
    private Board board;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        board = new Board(printStream, "123456789");
    }

    @Test
    public void startShouldDisplayEmptyBoard(){
        board.start();
        verify(printStream).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}

//    @Test
//    public void shouldDisplayBoard() {
//        board.displayBoard();
//        verify(printStream).println("1|2|3\n" +
//                "-----\n" +
//                "4|5|6\n" +
//                "-----\n" +
//                "7|8|9");
//    }

