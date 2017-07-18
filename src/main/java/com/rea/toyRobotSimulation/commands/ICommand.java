package com.rea.toyRobotSimulation.commands;

import com.rea.toyRobotSimulation.models.Location;
import com.rea.toyRobotSimulation.models.TableTop;

public interface ICommand {
    Location execute(Location location, TableTop tableTop);
}
