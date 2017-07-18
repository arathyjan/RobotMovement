package com.rea.toyRobotSimulation;

import com.rea.toyRobotSimulation.models.Coordinate;
import com.rea.toyRobotSimulation.models.Robot;
import com.rea.toyRobotSimulation.models.TableTop;

import java.io.IOException;
import java.net.URISyntaxException;

public class Main {
    public static void main(String[] args) throws IOException, URISyntaxException {
        Robot robot = new Robot(new TableTop(new Coordinate(0, 0), new Coordinate(5, 5)));
        robot.run();
    }
}