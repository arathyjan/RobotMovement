package com.ioof.robotMovement.models;

import com.ioof.robotMovement.commands.ICommand;
import com.ioof.robotMovement.parser.CommandParser;

public class Robot {
    private Location currentLocation;
    private TableTop tableTop;

    public Robot(TableTop tableTop) {
        this.tableTop = tableTop;
    }

    public Location getCurrentLocation() {
        return currentLocation;
    }

    void run(String commandString) {
        ICommand command = CommandParser.parse(commandString);
        currentLocation = command.execute(currentLocation);
    }
}
