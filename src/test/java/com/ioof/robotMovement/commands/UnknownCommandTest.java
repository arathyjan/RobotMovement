package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;
import org.junit.Test;

import static org.junit.Assert.*;

public class UnknownCommandTest {

    @Test
    public void shouldDoNothingIfCommandIsUNknown() {
        ICommand un = new UnknownCommand();

        Location location = un.execute(new Location(new Coordinate(2, 3), Direction.EAST), null);

        assertEquals(2, location.getCoordinate().getX());
        assertEquals(3, location.getCoordinate().getY());
        assertEquals(Direction.EAST, location.getDirection());
    }
}