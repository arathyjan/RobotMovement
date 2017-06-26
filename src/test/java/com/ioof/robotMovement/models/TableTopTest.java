package com.ioof.robotMovement.models;

import org.junit.Test;

import static org.junit.Assert.*;

public class TableTopTest {

    @Test
    public void returnIfCoordinateIsOutOfTableTop() {
        Coordinate topRight = new Coordinate(5, 5);
        Coordinate bottomLeft = new Coordinate(0, 0);
        TableTop tableTop = new TableTop(bottomLeft, topRight);

        assertTrue(tableTop.isOutOfTableTop(new Coordinate(6, 1)));
        assertTrue(tableTop.isOutOfTableTop(new Coordinate(-1, 4)));
        assertTrue(tableTop.isOutOfTableTop(new Coordinate(0, 6)));
        assertTrue(tableTop.isOutOfTableTop(new Coordinate(3, -1)));
        assertTrue(tableTop.isOutOfTableTop(new Coordinate(-1, -1)));
        assertTrue(tableTop.isOutOfTableTop(new Coordinate(5, 5)));
        assertFalse(tableTop.isOutOfTableTop(new Coordinate(3, 3)));
        assertFalse(tableTop.isOutOfTableTop(new Coordinate(0, 0)));
        assertFalse(tableTop.isOutOfTableTop(new Coordinate(4, 4)));
    }

}