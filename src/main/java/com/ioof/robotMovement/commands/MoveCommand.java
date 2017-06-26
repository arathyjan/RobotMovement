package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Location;

public class MoveCommand implements ICommand {

    @Override
    public Location execute(Location location) {
        if (location != null) {
            Coordinate coordinateDelta = location.getDirection().relativeCoordinateForMove();
            Coordinate coordinateBeforeMove = location.getCoordinate();
            Coordinate coordinateAfterMove = new Coordinate(coordinateBeforeMove.getX() + coordinateDelta.getX(), coordinateBeforeMove.getY() + coordinateDelta.getY());

            return new Location(coordinateAfterMove, location.getDirection());
        }

        return null;
    }
}
