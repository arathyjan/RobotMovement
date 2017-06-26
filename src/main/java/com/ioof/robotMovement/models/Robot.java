package com.ioof.robotMovement.models;

import com.ioof.robotMovement.commands.ICommand;
import com.ioof.robotMovement.parser.CommandParser;
import com.ioof.robotMovement.parser.CommandReader;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

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
