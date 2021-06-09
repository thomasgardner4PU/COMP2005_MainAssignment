package UnitTests;

import com.AllRestaurants;
import com.Requirements.InspectionScores;
import com.Restaurants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InspectionScoresUnitTests {

    @Test
    public void InspectionScoreTests() {
        Restaurants correctScoreRightNeighborhood = new Restaurants("13", "Manhattan" );
        Restaurants wrongScoreRightNeighborhood = new Restaurants("", "Brooklyn");
        Restaurants wrongScoreWrongNeighborhood = new Restaurants("10", "Plymouth");

        AllRestaurants allRestaurants = new AllRestaurants();
        allRestaurants.restaurants = new Restaurants[] { correctScoreRightNeighborhood, wrongScoreRightNeighborhood, wrongScoreWrongNeighborhood};

        Restaurants[] test = InspectionScores.getInspectionScores("Brooklyn", "10", allRestaurants).toArray(new Restaurants[0]);

        assertEquals(2, test.length);
        assertEquals(correctScoreRightNeighborhood, test[2]);
        assertEquals(wrongScoreRightNeighborhood, test[2]);
        assertEquals(wrongScoreWrongNeighborhood, test[2]);
    }
}
