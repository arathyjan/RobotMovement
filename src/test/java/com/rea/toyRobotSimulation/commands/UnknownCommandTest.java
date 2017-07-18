package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Coordinate;
import com.rea.toyRobotSimulation.models.Direction;
import com.rea.toyRobotSimulation.models.Location;
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