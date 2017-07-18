package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Location;
import com.rea.toyRobotSimulation.models.TableTop;

public class RightCommand implements ICommand {
    @Override
    public Location execute(Location location, TableTop tableTop) {
        if(location != null) {
            return new Location(location.getCoordinate(), location.getDirection().right());
        }
        return null;

    }
}
