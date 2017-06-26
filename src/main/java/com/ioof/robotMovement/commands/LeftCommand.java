package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;

public class LeftCommand implements ICommand {
    @Override
    public Location execute(Location location) {
        if(location != null) {
            return new Location(location.getCoordinate(), location.getDirection().left());
        }
        return null;
    }
}
