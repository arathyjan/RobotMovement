package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PlaceCommandTest {

    @Test
    public void executeShouldReturnBackLocationPlaceLocation() {
        Location location = new Location(new Coordinate(1, 2), Direction.EAST);
        PlaceCommand placeCommand = new PlaceCommand(location);

        Location placedLocation = placeCommand.execute(null, null);

        assertEquals(location, placedLocation);
    }

}