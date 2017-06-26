package com.ioof.robotMovement.models;

public enum Direction {
    NORTH {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(0, 1);
        }

        @Override
        public Direction left() {
            return WEST;
        }
    },

    SOUTH {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(0, -1);
        }

        @Override
        public Direction left() {
            return EAST;
        }
    },

    EAST {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(1, 0);
        }

        @Override
        public Direction left() {
            return NORTH;
        }
    },

    WEST {
        @Override
        public Coordinate relativeCoordinateForMove() {
            return new Coordinate(-1, 0);
        }

        @Override
        public Direction left() {
            return SOUTH;
        }
    };

    public abstract Coordinate relativeCoordinateForMove();

    public abstract Direction left();
}
