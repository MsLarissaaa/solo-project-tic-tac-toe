package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;


import java.io.IOException;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class GameTest {
    private Board board;
    private Game game;
    private InputParser inputParser;

    @Before
    public void setUp() throws Exception {
        inputParser = mock(InputParser.class);
        board = mock(Board.class);
        game = new Game(board, inputParser);
    }

    @Test
    public void startShouldDisplayEmptyBoard() {
        game.start();
        verify(board).display();
    }

    @Test
    public void moveShouldInitiateUserMove() throws IOException {
        game.move();
        verify(inputParser).userInput();
    }

}