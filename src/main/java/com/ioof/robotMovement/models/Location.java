package com.ioof.robotMovement.models;

public class Location {
    private Coordinate coordinate;
    private Direction direction;

    public Location(Coordinate coordinate, Direction direction) {
        this.coordinate = coordinate;
        this.direction = direction;
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public Direction getDirection() {
        return direction;
    }
}
