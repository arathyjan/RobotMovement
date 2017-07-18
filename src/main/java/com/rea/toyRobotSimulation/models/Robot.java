package com.rea.toyRobotSimulation.models;

import com.rea.toyRobotSimulation.commands.ICommand;
import com.rea.toyRobotSimulation.parser.CommandParser;
import com.rea.toyRobotSimulation.parser.CommandReader;

import java.io.IOException;
import java.net.URISyntaxException;

public class Robot {
    private Location currentLocation;
    private TableTop tableTop;

    public Robot(TableTop tableTop) {
        this.tableTop = tableTop;
    }

    Location getCurrentLocation() {
        return currentLocation;
    }

    void run(String commandString) {
        ICommand command = CommandParser.parse(commandString);
        currentLocation = command.execute(currentLocation, tableTop);
    }

    public void run() throws IOException, URISyntaxException {
        CommandReader.readInput().forEach(this::run);
    }
}
