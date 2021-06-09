package UnitTests;

import com.Reviews;
import org.junit.jupiter.api.Test;

class ReviewRatingsUnitTest {

    @Test
    void getRatings() {
        Reviews reviews = new Reviews();
        reviews.rating = 4;
        reviews.date = "October 26, 2016";
        reviews.name = "";
        reviews.comments = "";
    }

    @Test
    void wrongRating() {
        Reviews reviews = new Reviews();
        reviews.rating = 100;
    }

    @Test
    void IncorrectDate() {
        Reviews reviews = new Reviews();
        reviews.date = "December 32, 2020";
    }

    @Test
    void incorrectComment() {
        Reviews reviews = new Reviews();

        reviews.comments = "MEH. I've tried their Plymouth location as well but Devon meat quality is severely decreasing. A Korean bbq place with whatever meat? I think NOT!";
    }

    @Test
    void IncorrectName() {
        Reviews reviews = new Reviews();
        reviews.name = "Thomas";
    }

    @Test
    void correctRating() {
        Reviews reviews = new Reviews();
        reviews.rating = 4;
    }

    @Test
    void correctDate() {
        Reviews reviews = new Reviews();
        reviews.date = "October 26, 2016";
    }

    @Test
    void CorrectName() {
        Reviews reviews = new Reviews();

        reviews.name = "Steve";
    }

    @Test
    void correctComment() {
        Reviews reviews = new Reviews();

        reviews.comments = "MEH. I've tried their Jersey location as well but Kang Ho Dong meat quality is severely decreasing. A Korean bbq place with whatever meat? I think NOT!";
    }

}