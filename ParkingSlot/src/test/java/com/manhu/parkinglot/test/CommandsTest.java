package com.manhu.parkinglot.test;

import org.junit.Test;

import com.mahu.parkinglot.beans.PopulateCommands;

import static org.junit.Assert.*;
public class CommandsTest {
   PopulateCommands commands = new PopulateCommands();
    @Test
    public void checkCommandInList() throws Exception {
        assertFalse(commands.commandsMap.isEmpty());
        assertTrue(commands.commandsMap.containsKey("create_parking_lot"));
        assertFalse(commands.commandsMap.containsKey("mytestcommand"));
    }
}