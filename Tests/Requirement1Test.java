import com.Cuisineneighbourhood;
import com.Restaurants;
import com.AllRestaurants;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class Requirement1Test {

    private Object cuisineneighbourhood;

    Restaurants[] restaurants = new Restaurants[];

    @BeforeEach
    public void setCuisineneighbourhood() throws Exception {
        cuisineneighbourhood = new Cuisineneighbourhood();
    }

    @Test
    @DisplayName("Return specifc type of Cuisine in a specific neighborhood")
    public void testRequirement1() {
        Restaurants[] mustreturn = new Restaurants[1];
        mustreturn[0] = restaurants[9]
    }
}
