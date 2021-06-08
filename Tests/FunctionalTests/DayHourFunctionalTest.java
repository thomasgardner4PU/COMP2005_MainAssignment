package FunctionalTests;

import com.AllRestaurants;
import com.Requirements.DayHour;
import com.Restaurants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;
import java.text.ParseException;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DayHourFunctionalTest {

    private AllRestaurants restaurant;

    @BeforeEach
    public void setup() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        restaurant = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllRestaurants.class);
    }

    @Test
    @DisplayName("Simple Test for opening times of restaurant on specific day and hour ")
    public void testDayHour() throws ParseException {
        Restaurants[] test = DayHour.getTime("Monday", "5:30 pm - 11:00 pm", restaurant);

        for (Restaurants r:
                test) {
            assertEquals("Monday", r.operating_hours);
            assertEquals("5:30 pm - 11:00 pm", r.operating_hours);
        }
    }

    @Test
    void DateFormatTestConstructor() {
        Date date = new Date("11:30 am - 2:00 am");
        assertEquals("11:0 am - 2:0 am", date.toString());
    }

    @Test
    void dayTestConstructor() {
        Date d = new Date("Sat - 5:00 pm");
        assertEquals("0:0 - 17:0", d.toString());
    }

    @Test
    void wrongOpenTimeTest() {
        assertThrows(IllegalArgumentException.class, () -> new Date("13:00 pm - 9:00 pm"));
    }

    @Test
    void wrongClosingTime() {
        assertThrows(IllegalArgumentException.class, () -> new Date("9:00 am - 13:00 pm"));
    }

    @Test
    void openBeforeClosedTime() {
        assertThrows(IllegalArgumentException.class, () -> new Date("10:00 am - 9:00 am"));
    }

}
