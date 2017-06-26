package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Location;
import com.ioof.robotMovement.parser.LocationWriter;

public class ReportCommand implements ICommand {
    @Override
    public Location execute(Location location) {
        if (location != null) {
            Coordinate coordinate = location.getCoordinate();
            String locationString = String.format("%d,%d,%s", coordinate.getX(), coordinate.getY(), location.getDirection().name());
            LocationWriter.write(locationString);
            return location;
        }

        return null;
    }
}
