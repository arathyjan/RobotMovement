package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Coordinate;
import com.rea.toyRobotSimulation.models.Direction;
import com.rea.toyRobotSimulation.models.Location;
import com.rea.toyRobotSimulation.models.TableTop;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaceCommandTest {
    final TableTop tableTop = new TableTop(new Coordinate(0, 0), new Coordinate(5, 5));

    @Test
    public void executeShouldReturnBackLocationPlaceLocationIfcurrentLocationIsNull() {
        Location location = new Location(new Coordinate(1, 2), Direction.EAST);
        PlaceCommand placeCommand = new PlaceCommand(location);

        Location placedLocation = placeCommand.execute(null, tableTop);

        assertEquals(location, placedLocation);
    }

    @Test
    public void executeShouldReturnBackLocationPlaceLocationIfCurrentLocationIsNotNull() {
        Location location = new Location(new Coordinate(1, 2), Direction.EAST);
        PlaceCommand placeCommand = new PlaceCommand(location);
        Location currentLocation = new Location(new Coordinate(2, 3), Direction.EAST);

        Location placedLocation = placeCommand.execute(currentLocation, tableTop);

        assertEquals(location, placedLocation);
    }

    @Test
    public void doNothingIfPlaceIsOutsideTableTop() {
        Location location = new Location(new Coordinate(6, 6), Direction.EAST);
        PlaceCommand placeCommand = new PlaceCommand(location);
        Location currentLocation = new Location(new Coordinate(2, 3), Direction.EAST);

        Location newLocation = placeCommand.execute(currentLocation, tableTop);

        assertEquals(currentLocation, newLocation);
    }
}