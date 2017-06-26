package com.ioof.robotMovement.models;

public class TableTop {
    private Coordinate bottomLeft;
    private Coordinate topRight;

    public TableTop(Coordinate bottomLeft, Coordinate topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean isOutOfTableTop(Coordinate coordinate) {
        return coordinate.getX() < bottomLeft.getX()
                || coordinate.getX() >= topRight.getX()
                || coordinate.getY() < bottomLeft.getY()
                || coordinate.getY() >= topRight.getY();
    }
}
