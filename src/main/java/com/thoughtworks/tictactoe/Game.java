package com.thoughtworks.tictactoe;


import java.io.IOException;

public class Game {

    private final Board board;
    private final InputParser inputParser;

    public Game(Board board, InputParser inputParser){
        this.board = board;
        this.inputParser = inputParser;
    }

    public void start() {
        System.out.println("The board looks like this: ");
        System.out.println("");
        board.display();
        System.out.println("");
        System.out.println("Please choose a space to mark with 'X' and hit 'Enter'");
    }

    public void move() throws IOException {
        String inputString = inputParser.userInput();
        int indexToChange = inputParser.chosenIndex(inputString);
        board.update(indexToChange);
    }

}
