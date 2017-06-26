package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;
import com.ioof.robotMovement.models.TableTop;
import org.junit.Test;

import static org.junit.Assert.*;

public class MoveCommandTest {

    TableTop tableTop = new TableTop(new Coordinate(0, 0), new Coordinate(5, 5));

    @Test
    public void executeMoveCommandWillMoveInCorrectDirection() {
        ICommand moveCommand = new MoveCommand();

        Location location = moveCommand.execute(new Location(new Coordinate(2, 3), Direction.EAST), tableTop);

        assertEquals(3, location.getCoordinate().getX());
        assertEquals(3, location.getCoordinate().getY());
        assertEquals(Direction.EAST, location.getDirection());
    }

    @Test
    public void shouldSkipMoveIfLocationIsNull() {
        ICommand moveCommand = new MoveCommand();

        Location location = moveCommand.execute(null, tableTop);

        assertEquals(null, location);
    }

    @Test
    public void shouldNotMoveIfReachedTheBoundary() {
        ICommand moveCommand = new MoveCommand();

        Location currentLocation = new Location(new Coordinate(4, 4), Direction.EAST);
        Location location = moveCommand.execute(currentLocation, tableTop);

        assertEquals(4, location.getCoordinate().getX());
        assertEquals(4, location.getCoordinate().getY());
        assertEquals(Direction.EAST, location.getDirection());
    }
}