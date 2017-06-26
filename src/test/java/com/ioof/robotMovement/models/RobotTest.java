package com.ioof.robotMovement.models;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RobotTest {

    TableTop tableTop;

    @Before
    public void setUp() {
        tableTop = new TableTop(new Coordinate(0, 0), new Coordinate(5, 5));
    }

    @Test
    public void moveRobotAccordingToCommand() {
        Robot robot = new Robot(tableTop);

        robot.run("PLACE 3,4,NORTH");

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(4, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, robot.getCurrentLocation().getDirection());
    }
}