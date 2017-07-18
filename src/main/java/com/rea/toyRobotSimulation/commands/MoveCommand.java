package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Coordinate;
import com.rea.toyRobotSimulation.models.Location;
import com.rea.toyRobotSimulation.models.TableTop;

public class MoveCommand implements ICommand {

    @Override
    public Location execute(Location location, TableTop tableTop) {
        if (location != null) {
            Coordinate coordinateAfterMove = getCoordinateAfterMove(location);
            if(tableTop.isOutOfTableTop(coordinateAfterMove)) {
                return location;
            }
            return new Location(coordinateAfterMove, location.getDirection());
        }

        return null;
    }

    private Coordinate getCoordinateAfterMove(Location location) {
        Coordinate coordinateDelta = location.getDirection().relativeCoordinateForMove();
        Coordinate coordinateBeforeMove = location.getCoordinate();
        return new Coordinate(coordinateBeforeMove.getX() + coordinateDelta.getX(), coordinateBeforeMove.getY() + coordinateDelta.getY());
    }
}
