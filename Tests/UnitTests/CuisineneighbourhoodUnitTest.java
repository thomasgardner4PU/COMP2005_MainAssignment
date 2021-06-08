package UnitTests;

import com.AllRestaurants;
import com.Cuisineneighbourhood;
import com.Restaurants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CuisineneighbourhoodUnitTest {



    // performing unit test
    @Test
    public void test1() {
        Restaurants wrongCuisine = new Restaurants("Manhatten", "American");
        Restaurants wrongNeighborhod = new Restaurants("Brooklyn", "Asian");
        Restaurants correctRestaurant = new Restaurants("Manhattan", "Asian");

        AllRestaurants allRestaurants = new AllRestaurants();
        allRestaurants.restaurants = new Restaurants[]  { wrongCuisine, wrongNeighborhod, correctRestaurant };

        Restaurants[] test = Cuisineneighbourhood.Filter("Asian", "Manhattan", allRestaurants);

        assertEquals(1,test.length); // only expecting the array to have item value inside
        assertEquals(correctRestaurant,test[0]); // make sure that only value inside of test array is the correct restaurant
        assertNotEquals(wrongCuisine, test[0]);
        assertNotEquals(wrongNeighborhod, test[0]);
    }

}