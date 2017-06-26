package com.ioof.robotMovement.parser;

import com.ioof.robotMovement.commands.*;
import com.ioof.robotMovement.models.Direction;
import org.junit.Test;

import static org.junit.Assert.*;

public class CommandParserTest {

    @Test
    public void parsePLACECommand() {
        ICommand command = CommandParser.parse("PLACE 0,0,NORTH");

        assertTrue(command instanceof PlaceCommand);

        PlaceCommand placeCommand = (PlaceCommand) command;
        assertEquals(0, placeCommand.getLocation().getCoordinate().getX());
        assertEquals(0, placeCommand.getLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, placeCommand.getLocation().getDirection());
    }

    @Test
    public void parseMOVECommand() {
        ICommand command = CommandParser.parse("MOVE");

        assertTrue(command instanceof MoveCommand);
    }

    @Test
    public void parseLEFTCommand() {
        ICommand command = CommandParser.parse("LEFT");

        assertTrue(command instanceof LeftCommand);
    }

    @Test
    public void parseRIGHTCommand() {
        ICommand command = CommandParser.parse("RIGHT");

        assertTrue(command instanceof RightCommand);
    }
}