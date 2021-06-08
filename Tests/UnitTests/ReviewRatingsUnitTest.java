package UnitTests;

import com.Reviews;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReviewRatingsUnitTest {

    @Test
    void getRatings() {
        Reviews reviews = new Reviews();
        reviews.rating = 4;
    }
}