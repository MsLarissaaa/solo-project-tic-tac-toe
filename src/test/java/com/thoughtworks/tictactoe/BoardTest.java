package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.PrintStream;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class BoardTest {

    private PrintStream printStream;
    private Board board;
    private String[] boardArray;

    @Before
    public void setUp() throws Exception {
        printStream = mock(PrintStream.class);
        boardArray = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        board = new Board(printStream, boardArray);
    }

    @Test
    public void shouldDisplayBoard() {
        board.display();
        verify(printStream).println("1|2|3\n" +
                "-----\n" +
                "4|5|6\n" +
                "-----\n" +
                "7|8|9");
    }
}
