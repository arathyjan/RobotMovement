package com.ioof.robotMovement.parser;

import com.ioof.robotMovement.commands.ICommand;
import com.ioof.robotMovement.commands.PlaceCommand;
import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;

public class CommandParser {

    public static ICommand parse(String commandString) {
        if(commandString.contains("PLACE")) {
            String[] coordinateDirection = commandString.split(" ")[1].split(",");
            int xCoordinate = Integer.parseInt(coordinateDirection[0]);
            int yCoordinate = Integer.parseInt(coordinateDirection[1]);
            Direction direction = Direction.valueOf(coordinateDirection[2]);
            Location location = new Location(new Coordinate(xCoordinate, yCoordinate), direction);
            return new PlaceCommand(location);
        }
        return null;
    }
}
