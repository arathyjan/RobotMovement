package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;
import com.ioof.robotMovement.models.TableTop;

public class LeftCommand implements ICommand {
    @Override
    public Location execute(Location location, TableTop tableTop) {
        if(location != null) {
            return new Location(location.getCoordinate(), location.getDirection().left());
        }
        return null;
    }
}
