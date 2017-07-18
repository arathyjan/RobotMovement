package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Location;
import com.rea.toyRobotSimulation.models.TableTop;

public class UnknownCommand implements ICommand {
    @Override
    public Location execute(Location location, TableTop tableTop) {
        return location;
    }
}
