import com.AllRestaurants;
import com.Cuisineneighbourhood;
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
    @DisplayName("Simple Test for restaurant of Type Cuisine")
    public void testCuisine() {
        Restaurants[] test = Cuisineneighbourhood.Filter("Asian", "Manhattan", restaurant);

        for (Restaurants r:
                test) {
            assertEquals("Asian", r.cuisine_type);
            assertEquals("Manhattan", r.neighborhood);
        }
    }
}
