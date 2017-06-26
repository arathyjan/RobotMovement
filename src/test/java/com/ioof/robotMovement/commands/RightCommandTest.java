package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;
import org.junit.Test;

import static org.junit.Assert.*;

public class RightCommandTest {
    @Test
    public void executeMoveCommandWillMoveInCorrectDirection() {
        ICommand rightCommand = new RightCommand();

        Location location = rightCommand.execute(new Location(new Coordinate(2, 3), Direction.EAST), null);

        assertEquals(2, location.getCoordinate().getX());
        assertEquals(3, location.getCoordinate().getY());
        assertEquals(Direction.SOUTH, location.getDirection());
    }

    @Test
    public void shouldSkipMoveIfLocationIsNull() {
        ICommand rightCommand = new RightCommand();

        Location location = rightCommand.execute(null, null);

        assertEquals(null, location);
    }

}