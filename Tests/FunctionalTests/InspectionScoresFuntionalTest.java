package FunctionalTests;

import com.AllRestaurants;
import com.Requirements.InspectionScores;
import com.Restaurants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InspectionScoresFuntionalTest {

    private AllRestaurants restaurant;

    @BeforeEach
    public void setup() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        restaurant = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllRestaurants.class);
    }

    @Test
    @DisplayName("Simple test for all restaurants of specific inspection scores")
    public void testInspectionScores() {
        Restaurants[] inspectionScores = InspectionScores.getInspectionScores("American", "13", restaurant).toArray(new Restaurants[0]);


        for (Restaurants r :
                inspectionScores) {
            assertEquals("Manhattan", r.neighborhood);
            assertEquals("American", r.cuisine_type);
        }
    }
}
