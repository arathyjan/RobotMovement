package com.ioof.robotMovement.models;

public class TableTop {
    private Coordinate bottomLeft;
    private Coordinate topRight;

    public TableTop(Coordinate bottomLeft, Coordinate topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
}
