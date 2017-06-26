package com.ioof.robotMovement.models;

public enum Direction {
    NORTH {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(0, 1);
        }
    },

    SOUTH {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(0, -1);
        }
    },

    EAST {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(1, 0);
        }
    },

    WEST {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(-1, 0);
        }
    };

    public abstract Coordinate relativeCoordinateForMove();
}
