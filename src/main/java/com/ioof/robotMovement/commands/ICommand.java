package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Location;
import com.ioof.robotMovement.models.TableTop;

public interface ICommand {
    Location execute(Location location, TableTop tableTop);
}
