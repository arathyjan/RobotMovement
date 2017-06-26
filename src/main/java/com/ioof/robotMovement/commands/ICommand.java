package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;

public interface ICommand {
    Location execute(Location location);
}
