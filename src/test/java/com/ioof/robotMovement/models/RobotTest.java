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
    public void runPlaceCommandSuccessfully() {
        Robot robot = new Robot(tableTop);

        robot.run("PLACE 3,4,NORTH");

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(4, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, robot.getCurrentLocation().getDirection());
    }

    @Test
    public void runMoveCommandSuccessfully() {
        Robot robot = new Robot(tableTop);

        robot.run("PLACE 3,4,NORTH");
        robot.run("MOVE");

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(5, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, robot.getCurrentLocation().getDirection());
    }

    @Test
    public void shouldSkipMoveIfPlaceNotExecuted() {
        Robot robot = new Robot(tableTop);

        robot.run("MOVE");

        assertEquals(null, robot.getCurrentLocation());
    }

    @Test
    public void runLeftCommandSuccessfully() {
        Robot robot = new Robot(tableTop);

        robot.run("PLACE 3,4,NORTH");
        robot.run("LEFT");

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(4, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.WEST, robot.getCurrentLocation().getDirection());
    }

    @Test
    public void shouldSkipLeftIfPlaceNotExecuted() {
        Robot robot = new Robot(tableTop);

        robot.run("LEFT");

        assertEquals(null, robot.getCurrentLocation());
    }
}