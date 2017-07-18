package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Location;
import com.rea.toyRobotSimulation.models.TableTop;

public class PlaceCommand implements ICommand {
    private Location location;

    public PlaceCommand(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public Location execute(Location currentLocation, TableTop tableTop) {
        return tableTop.isOutOfTableTop(location.getCoordinate()) ? currentLocation : location;
    }
}
