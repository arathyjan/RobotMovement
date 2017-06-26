package com.ioof.robotMovement.commands;

import com.ioof.robotMovement.models.Coordinate;
import com.ioof.robotMovement.models.Direction;
import com.ioof.robotMovement.models.Location;
import com.ioof.robotMovement.parser.LocationWriter;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.easymock.EasyMock.expect;
import static org.junit.Assert.*;
import static org.powermock.api.easymock.PowerMock.mockStatic;
import static org.powermock.api.easymock.PowerMock.replayAll;
import static org.powermock.api.easymock.PowerMock.verifyAll;

@RunWith(PowerMockRunner.class)
@PrepareForTest(LocationWriter.class)
public class ReportCommandTest {

    @Before
    public void setUp() {
        mockStatic(LocationWriter.class);
    }

    @Test
    public void executeReportCommandWriteToLocationWriter() {
        ICommand reportCommand = new ReportCommand();

        expect(LocationWriter.write("2,3,EAST")).andReturn(true);

        replayAll();
        reportCommand.execute(new Location(new Coordinate(2, 3), Direction.EAST), null);
        verifyAll();
    }

    @Test
    public void executeReportCommandReturnBackSameLocation() {
        ICommand reportCommand = new ReportCommand();

        Location location = reportCommand.execute(new Location(new Coordinate(2, 3), Direction.EAST), null);

        assertEquals(2, location.getCoordinate().getX());
        assertEquals(3, location.getCoordinate().getY());
        assertEquals(Direction.EAST, location.getDirection());
    }

    @Test
    public void shouldSkipMoveIfLocationIsNull() {
        ICommand reportCommand = new ReportCommand();

        Location location = reportCommand.execute(null, null);

        assertEquals(null, location);
    }
}