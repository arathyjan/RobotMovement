package com.rea.toyRobotSimulation.parser;

import com.rea.toyRobotSimulation.models.Direction;
import com.rea.toyRobotSimulation.commands.*;
import org.junit.Assert;
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
        Assert.assertEquals(Direction.NORTH, placeCommand.getLocation().getDirection());
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

    @Test
    public void parseREPORTCommand() {
        ICommand command = CommandParser.parse("REPORT");

        assertTrue(command instanceof ReportCommand);
    }

    @Test
    public void unknownCommand() {
        ICommand command = CommandParser.parse("UNKNWON");

        assertTrue(command instanceof UnknownCommand);
    }

    @Test
    public void unknownCommandWithWordPLACEAndDirectionWrong() {
        assertTrue(CommandParser.parse("PLACE 0,0,ABCD") instanceof UnknownCommand);
        assertTrue(CommandParser.parse("PLACE something") instanceof UnknownCommand);
        assertTrue(CommandParser.parse("PLACE 0,0, ") instanceof UnknownCommand);
    }
}