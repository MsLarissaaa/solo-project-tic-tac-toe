package com.thoughtworks.tictactoe;


import java.io.BufferedReader;
import java.io.IOException;

public class InputParser {

    private BufferedReader bufferedReader;

    public InputParser(BufferedReader bufferedReader){
        this.bufferedReader = bufferedReader;
    }

    public String userInput() throws IOException {
        String input = bufferedReader.readLine();
        return input;
    }

    public int chosenIndex(String s) {
        return Integer.parseInt(s) - 1;
    }
}





