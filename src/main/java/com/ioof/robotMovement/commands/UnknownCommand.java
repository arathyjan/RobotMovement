package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;
import com.ioof.robotMovement.models.TableTop;

public class UnknownCommand implements ICommand {
    @Override
    public Location execute(Location location, TableTop tableTop) {
        return location;
    }
}
