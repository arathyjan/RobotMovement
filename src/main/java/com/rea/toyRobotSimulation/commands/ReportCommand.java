package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Coordinate;
import com.rea.toyRobotSimulation.models.Location;
import com.rea.toyRobotSimulation.models.TableTop;
import com.rea.toyRobotSimulation.parser.LocationWriter;

public class ReportCommand implements ICommand {
    @Override
    public Location execute(Location location, TableTop tableTop) {
        if (location != null) {
            Coordinate coordinate = location.getCoordinate();
            String locationString = String.format("%d,%d,%s", coordinate.getX(), coordinate.getY(), location.getDirection().name());
            LocationWriter.write(locationString);
            return location;
        }

        return null;
    }
}
