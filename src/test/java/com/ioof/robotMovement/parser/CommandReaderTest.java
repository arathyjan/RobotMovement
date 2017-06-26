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

        assertEquals(26, commandStringList.size());
        assertEquals("PLACE 4,2,EAST", commandStringList.get(0));
        assertEquals("REPORT", commandStringList.get(11));
    }
}