package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;
import org.junit.Test;

import static org.junit.Assert.*;

public class LeftCommandTest {

    @Test
    public void executeMoveCommandWillMoveInCorrectDirection() {
        ICommand leftCommand = new LeftCommand();

        Location location = leftCommand.execute(new Location(new Coordinate(2, 3), Direction.EAST));

        assertEquals(2, location.getCoordinate().getX());
        assertEquals(3, location.getCoordinate().getY());
        assertEquals(Direction.NORTH, location.getDirection());
    }

    @Test
    public void shouldSkipMoveIfLocationIsNull() {
        ICommand leftCommand = new LeftCommand();

        Location location = leftCommand.execute(null);

        assertEquals(null, location);
    }
}