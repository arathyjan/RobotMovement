package com.ioof.robotMovement.models;

import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;

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

        robot.run("PLACE 3,3,NORTH");
        robot.run("MOVE");

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(4, robot.getCurrentLocation().getCoordinate().getY());
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

    @Test
    public void runRightCommandSuccessfully() {
        Robot robot = new Robot(tableTop);

        robot.run("PLACE 3,4,NORTH");
        robot.run("RIGHT");

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(4, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.EAST, robot.getCurrentLocation().getDirection());
    }

    @Test
    public void shouldSkipRightIfPlaceNotExecuted() {
        Robot robot = new Robot(tableTop);

        robot.run("RIGHT");

        assertEquals(null, robot.getCurrentLocation());
    }

    @Test
    public void runReportCommandSuccessfully() {
        Robot robot = new Robot(tableTop);

        robot.run("PLACE 3,4,NORTH");
        robot.run("REPORT");

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(4, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, robot.getCurrentLocation().getDirection());
    }

    @Test
    public void shouldSkipReportIfPlaceNotExecuted() {
        Robot robot = new Robot(tableTop);

        robot.run("REPORT");

        assertEquals(null, robot.getCurrentLocation());
    }

    @Test
    public void ShouldSkipMoveCommandIfGoingOutOfTableTop() {
        Robot robot = new Robot(tableTop);

        robot.run("PLACE 4,4,NORTH");
        robot.run("MOVE");
        robot.run("MOVE");
        robot.run("MOVE");
        robot.run("MOVE");
        robot.run("MOVE");

        assertEquals(4, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(4, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, robot.getCurrentLocation().getDirection());
    }

    @Test
    public void shouldReadFromFileExecuteAllCommands() throws IOException, URISyntaxException {
        Robot robot = new Robot(tableTop);

        robot.run();

        assertEquals(3, robot.getCurrentLocation().getCoordinate().getX());
        assertEquals(3, robot.getCurrentLocation().getCoordinate().getY());
        assertEquals(Direction.NORTH, robot.getCurrentLocation().getDirection());
    }
}