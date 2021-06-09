package UnitTests;

import com.OperatingHours;
import org.junit.jupiter.api.Test;


class DayHourUnitTest {

    @Test
    void getTime() {
        OperatingHours correcttime = new OperatingHours();
        correcttime.Monday = "11:30 am - 2:00 am";
        correcttime.Tuesday = "11:30 am - 2:00 am";
        correcttime.Wednesday = "11:30 am - 2:00 am";
        correcttime.Thursday = "11:30 am - 2:00 am";
        correcttime.Friday = "11:30 am - 6:00 am";
        correcttime.Saturday = "11:30 am - 6:00 am";
        correcttime.Sunday = "11:30 am - 2:00 am";
    }

    @Test
    void closedTime() {
        OperatingHours closed = new OperatingHours();
        closed.Monday = "Closed";
        closed.Tuesday = "Closed";
    }

    @Test
    void open24HourTime() {
        OperatingHours allday = new OperatingHours();
        allday.Saturday = "Open 24 hours";
    }

    @Test
    void openTillNextDay() {
        OperatingHours open = new OperatingHours();
        open.Friday = "8:00 am - Sat";
        open.Sunday = "Sat - 10:30 pm";
    }
}