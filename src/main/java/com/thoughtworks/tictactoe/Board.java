package com.thoughtworks.tictactoe;

import java.io.PrintStream;
import java.util.ArrayList;

public class Board {

    private String[] boardArray;
    private PrintStream printStream;

    public Board(PrintStream printStream, String startingBoard) {
        this.printStream = printStream;
        this.boardArray = startingBoard.split("");
//        for (String elem: boardArray){
////            System.out.print(elem + " ");
//        }
    }

    public void start() {
        displayBoard();
    }

    private void displayBoard() {
        String boardString = "";
        for (int ind = 1; ind < 3; ind++){
            boardString += boardArray[ind] + "|";
        }
        boardString += boardArray[3] + "\n";
        boardString += "-----\n";
        for (int ind = 4; ind < 6; ind++){
            boardString += boardArray[ind] + "|";
        }
        boardString += boardArray[6] + "\n";
        boardString += "-----\n";
        for (int ind = 7; ind < 9; ind++){
            boardString += boardArray[ind] + "|";
        }
        boardString += boardArray[9];

        printStream.println(boardString);
    }

}
