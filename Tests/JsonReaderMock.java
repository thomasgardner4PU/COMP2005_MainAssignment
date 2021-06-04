import com.AllRestaurants;
import com.Restaurants;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;


public class JsonReaderMock {

    @BeforeEach
    public static void main(String[] args) throws IOException, URISyntaxException {
        // write your code here

        Restaurants[] restaurants = new Restaurants[]{};

        try {

            ObjectMapper mapper = new ObjectMapper();

            AllRestaurants restaurant = mapper.readValue(new File("Tests\\restaurant-data.json"), AllRestaurants.class);

            //             Restaurants[] test = Cuisineneighbourhood.Filter(restaurant);
            //             String Results = "Results"; //to view the results
//            Restaurants[] test2 = DayHour.getTime(restaurant);
//            String SecondsetofResults = "Results";
            //            Restaurants[] test3 = ReviewRatings.getRatings(restaurant)
            //            String thirdsetofresults = "Results";
//                             ArrayList<Restaurants> test4 = InspectionScores.getInspectionScores(restaurant);
//                                String fourthsetofresults = "Results";

            System.out.println(restaurant);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
