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

        @Override
        public Direction right() {
            return EAST;
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

        @Override
        public Direction right() {
            return WEST;
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

        @Override
        public Direction right() {
            return SOUTH;
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

        @Override
        public Direction right() {
            return NORTH;
        }
    };

    public abstract Coordinate relativeCoordinateForMove();

    public abstract Direction left();

    public abstract Direction right();
}
