package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveCommandTest {

    @Test
    public void executeMoveCommandWillMoveInCorrectDirection() {
        ICommand moveCommand = new MoveCommand();

        Location location = moveCommand.execute(new Location(new Coordinate(2, 3), Direction.EAST));

        assertEquals(3, location.getCoordinate().getX());
        assertEquals(3, location.getCoordinate().getY());
        assertEquals(Direction.EAST, location.getDirection());
    }

    @Test
    public void shouldSkipMoveIfLocationIsNull() {
        ICommand moveCommand = new MoveCommand();

        Location location = moveCommand.execute(null);

        assertEquals(null, location);
    }
}