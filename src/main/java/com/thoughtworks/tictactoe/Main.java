package com.thoughtworks.tictactoe;


import java.io.PrintStream;

public class Main {

    public static void main(String[] args) {
        PrintStream printStream = System.out;
        Board board = new Board(printStream, "123456789");
        board.start();
    }

}
