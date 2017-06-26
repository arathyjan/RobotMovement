package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;

public class RightCommand implements ICommand {
    @Override
    public Location execute(Location location) {
        if(location != null) {
            return new Location(location.getCoordinate(), location.getDirection().right());
        }
        return null;

    }
}
