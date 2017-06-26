package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;

public class PlaceCommand implements ICommand {
    private Location location;

    public PlaceCommand(Location location) {
        this.location = location;
    }

    public Location getLocation() {
        return location;
    }

    @Override
    public Location execute(Location currentLocation) {
        return location;
    }
}
