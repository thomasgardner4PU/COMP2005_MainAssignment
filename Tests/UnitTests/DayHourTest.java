package UnitTests;

import com.OperatingHours;
import com.Restaurants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DayHourTest {

    @Test
    void getTime() {
        OperatingHours operatingHours = new OperatingHours();
        operatingHours.Monday = "5:30 pm - 11:00 pm";


        Restaurants rightDay = new Restaurants(operatingHours);
    }

}