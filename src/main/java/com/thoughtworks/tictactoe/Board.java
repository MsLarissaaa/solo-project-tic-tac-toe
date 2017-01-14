package com.thoughtworks.tictactoe;

import java.io.PrintStream;


public class Board {

    private String[] boardArray;
    private PrintStream printStream;

    public Board(PrintStream printStream, String[] startingBoard) {
        this.printStream = printStream;
        this.boardArray = startingBoard;
    }


    public void display() {
        String boardString = "";
        for (int ind = 0; ind < 2; ind++){
            boardString += boardArray[ind] + "|";
        }
        boardString += boardArray[2] + "\n";
        boardString += "-----\n";
        for (int ind = 3; ind < 5; ind++){
            boardString += boardArray[ind] + "|";
        }
        boardString += boardArray[5] + "\n";
        boardString += "-----\n";
        for (int ind = 6; ind < 8; ind++){
            boardString += boardArray[ind] + "|";
        }
        boardString += boardArray[8];

        printStream.println(boardString);
    }

    public void update(int commandX) {
        boardArray[commandX] = "X";
        display();
    }

}
