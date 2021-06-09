package FunctionalTests;

import com.AllRestaurants;
import com.Requirements.Cuisineneighbourhood;
import com.Restaurants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CuisineneighbourhoodFunctionalTest {



    private AllRestaurants restaurant;

    // restaurant that im testing

    @BeforeEach
    public void setUp() throws Exception {
        ObjectMapper mapper = new ObjectMapper();

        restaurant = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllRestaurants.class);
    }



    @Test
    @DisplayName("Checking if the supplied cuisine and neigborhood matches")
    public void testCuisineNeighborhood() {
        Restaurants[] correctCuisine = Cuisineneighbourhood.Filter("Asian", "Manhattan", restaurant);

        for (Restaurants r:
                correctCuisine) {
            assertEquals("Asian", r.cuisine_type);
            assertEquals("Manhattan", r.neighborhood);
        }
    }

    @Test
    @DisplayName("To verify if the supplied cuisine is wrong")
    public void testWrongCuisine() {
        Restaurants[] wrongCuisine = Cuisineneighbourhood.Filter("Americen", "Manhattan", restaurant);

        for (Restaurants r:
        wrongCuisine) {
            assertEquals("American", r.cuisine_type);
            assertEquals("Manhattan", r.neighborhood);
        }
    }
}
