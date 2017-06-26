package com.ioof.robotMovement.parser;

import com.ioof.robotMovement.commands.*;
import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;

import java.util.HashMap;
import java.util.Map;

public class CommandParser {

    private static final Map<String, ICommand> commandMap = new HashMap<String, ICommand>(){{
        put("MOVE", new MoveCommand());
        put("LEFT", new LeftCommand());
        put("RIGHT", new RightCommand());
        put("REPORT", new ReportCommand());
    }};

    public static ICommand parse(String commandString) {
        if(isPlaceCommand(commandString)) {
            String[] coordinateDirection = commandString.split(" ")[1].split(",");
            int xCoordinate = Integer.parseInt(coordinateDirection[0]);
            int yCoordinate = Integer.parseInt(coordinateDirection[1]);
            Direction direction = Direction.valueOf(coordinateDirection[2]);
            Location location = new Location(new Coordinate(xCoordinate, yCoordinate), direction);
            return new PlaceCommand(location);
        }
        ICommand command = commandMap.get(commandString);
        return command != null ? command : new UnknownCommand();
    }

    private static boolean isPlaceCommand(String commandString) {
        return commandString.matches(getPlaceCommandRegex());
    }

    private static String getPlaceCommandRegex() {
        StringBuilder placeCommandRegexBuilder = new StringBuilder();
        placeCommandRegexBuilder.append("(PLACE )[0-9](,)[0-9](,)(");
        for (int i = 0; i < Direction.values().length; i++) {
            if(i > 0) {
                placeCommandRegexBuilder.append("|");
            }
            placeCommandRegexBuilder.append(Direction.values()[i].name());
        }
        placeCommandRegexBuilder.append(")");
        return placeCommandRegexBuilder.toString();
    }
}
