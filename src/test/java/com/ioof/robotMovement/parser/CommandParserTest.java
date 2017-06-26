package com.ioof.robotMovement.parser;

import com.ioof.robotMovement.commands.ICommand;
import com.ioof.robotMovement.commands.PlaceCommand;
import com.ioof.robotMovement.models.Direction;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandParserTest {

    @Test
    public void parsePLACECommand() {
        String commandString = "PLACE 0,0,NORTH";

        ICommand command = CommandParser.parse(commandString);

        assertTrue(command instanceof PlaceCommand);

        PlaceCommand placeCommand = (PlaceCommand) command;
        assertEquals(0, placeCommand.getLocation().getCoordinate().getX());
        assertEquals(0, placeCommand.getLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, placeCommand.getLocation().getDirection());
    }
}