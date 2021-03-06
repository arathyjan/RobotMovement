package com.rea.toyRobotSimulation.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class DirectionTest {

    @Test
    public void relativeCoordinateForMoveWhenNorth() {
        Coordinate coordinate = Direction.NORTH.relativeCoordinateForMove();

        assertEquals(0, coordinate.getX());
        assertEquals(1, coordinate.getY());
    }

    @Test
    public void relativeCoordinateForMoveWhenSouth() {
        Coordinate coordinate = Direction.SOUTH.relativeCoordinateForMove();

        assertEquals(0, coordinate.getX());
        assertEquals(-1, coordinate.getY());
    }

    @Test
    public void relativeCoordinateForMoveWhenEast() {
        Coordinate coordinate = Direction.EAST.relativeCoordinateForMove();

        assertEquals(1, coordinate.getX());
        assertEquals(0, coordinate.getY());
    }

    @Test
    public void relativeCoordinateForMoveWhenWest() {
        Coordinate coordinate = Direction.WEST.relativeCoordinateForMove();

        assertEquals(-1, coordinate.getX());
        assertEquals(0, coordinate.getY());
    }

    @Test
    public void directionAfterTurningLeftForNorth() {
        Direction direction = Direction.NORTH.left();

        assertEquals(Direction.WEST, direction);
    }

    @Test
    public void directionAfterTurningLeftForWest() {
        Direction direction = Direction.WEST.left();

        assertEquals(Direction.SOUTH, direction);
    }

    @Test
    public void directionAfterTurningLeftForSouth() {
        Direction direction = Direction.SOUTH.left();

        assertEquals(Direction.EAST, direction);
    }

    @Test
    public void directionAfterTurningLeftForEast() {
        Direction direction = Direction.EAST.left();

        assertEquals(Direction.NORTH, direction);
    }


    @Test
    public void directionAfterTurningRightForNorth() {
        Direction direction = Direction.NORTH.right();

        assertEquals(Direction.EAST, direction);
    }

    @Test
    public void directionAfterTurningRightForWest() {
        Direction direction = Direction.WEST.right();

        assertEquals(Direction.NORTH, direction);
    }

    @Test
    public void directionAfterTurningRightForSouth() {
        Direction direction = Direction.SOUTH.right();

        assertEquals(Direction.WEST, direction);
    }

    @Test
    public void directionAfterTurningRightForEast() {
        Direction direction = Direction.EAST.right();

        assertEquals(Direction.SOUTH, direction);
    }

}