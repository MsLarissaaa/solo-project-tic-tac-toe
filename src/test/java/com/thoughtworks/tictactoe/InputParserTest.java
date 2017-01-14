package com.thoughtworks.tictactoe;

import org.junit.Before;
import org.junit.Test;

import java.io.BufferedReader;
import java.io.IOException;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class InputParserTest {

    private BufferedReader bufferedReader;
    private InputParser inputParser;

    @Before
    public void setUp() throws Exception {
        bufferedReader = mock(BufferedReader.class);
        inputParser = new InputParser(bufferedReader);
    }

    @Test
    public void shouldReturnInputFromUser() throws IOException {
        when(bufferedReader.readLine()).thenReturn("2");
        String input = inputParser.userInput();
        assertThat(input, is("2"));
    }

    @Test
    public void shouldConvertInputToArrayIndex() throws IOException {
        int index = inputParser.chosenIndex("2");
        assertThat(index, is(1));
    }

}