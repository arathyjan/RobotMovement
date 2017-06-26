package com.ioof.robotMovement.models;

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
}