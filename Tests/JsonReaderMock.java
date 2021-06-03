import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.text.ParseException;
import java.util.ArrayList;

import com.AllRestaurants;
import com.DayHour;
import com.Restaurants;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonReaderMock {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // write your code here

        Restaurants[] restaurants = new Restaurants[]{};

        try {

            ObjectMapper mapper = new ObjectMapper();

            AllRestaurants restaurant = mapper.readValue(new File("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllRestaurants.class);

            //             Restaurants[] test = Cuisineneighbourhood.Filter(restaurant);
            //             String Results = "Results"; //to view the results
            Restaurants[] test2 = DayHour.getTime(restaurant);
            String SecondsetofResults = "Results";
            //            Restaurants[] test3 = ReviewRatings.getRatings(restaurant)
            //            String thirdsetofresults = "Results";
//                             ArrayList<Restaurants> test4 = InspectionScores.getInspectionScores(restaurant);
//                                String fourthsetofresults = "Results";

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }


    }
}
