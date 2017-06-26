package com.ioof.robotMovement.parser;

import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

import static org.junit.Assert.*;

public class CommandReaderTest {

    @Test
    public void shouldReadCommandsFromFile() throws IOException, URISyntaxException {
        List<String> commandStringList = CommandReader.readInput();

        assertEquals(12, commandStringList.size());
        assertEquals("PLACE 0,0,NORTH", commandStringList.get(0));
        assertEquals("REPORT", commandStringList.get(11));
    }

}