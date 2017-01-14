package com.thoughtworks.tictactoe;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Main {

    public static void main(String[] args) throws IOException {
        PrintStream printStream = System.out;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String[] boardArray = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9"};
        Board board = new Board(printStream, boardArray);
        InputParser inputParser = new InputParser(bufferedReader);
        Game game = new Game(board, inputParser);
        game.start();
        game.move();
    }

}
