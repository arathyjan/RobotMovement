package com.ioof.robotMovement.models;

public class TableTop {
    private Coordinate bottomLeft;
    private Coordinate topRight;

    public TableTop(Coordinate bottomLeft, Coordinate topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    public boolean isOutOfTableTop(Coordinate coordinateAfterMove) {
        return coordinateAfterMove.getX() < bottomLeft.getX()
                || coordinateAfterMove.getX() >= topRight.getX()
                || coordinateAfterMove.getY() < bottomLeft.getY()
                || coordinateAfterMove.getY() >= topRight.getY();
    }
}
