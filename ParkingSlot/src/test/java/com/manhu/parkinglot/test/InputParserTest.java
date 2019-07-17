package com.manhu.parkinglot.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.mahu.parkinglot.beans.InputLot;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.*;

public class InputParserTest {
    InputLot inputParser = new InputLot();
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    @Before
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }
    @Test
    public void parseTextInput() throws Exception {
        inputParser.parseTextInput("hello");
        assertEquals("Invalidinput", outContent.toString().trim().replace(" ", ""));
        inputParser.parseTextInput("status");
        assertEquals("Invalidinput\nSorry,parkinglotisnotcreated", outContent.toString().trim().replace(" ", ""));
    }

}