package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;
import com.ioof.robotMovement.models.TableTop;

public class PlaceCommand implements ICommand {
    private Location location;

    public PlaceCommand(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public Location execute(Location currentLocation, TableTop tableTop) {
        return location;
    }
}
