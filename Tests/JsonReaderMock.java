import com.AllRestaurants;
import com.Restaurants;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeEach;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;


public class JsonReaderMock {

    @BeforeEach
    public static void main(String[] args) throws IOException, URISyntaxException {
        // write your code here

        Restaurants[] restaurants = new Restaurants[]{};

        // this method accesses the json file containing the information for all restaurants and parses it.
        try {

            ObjectMapper mapper = new ObjectMapper();

            AllRestaurants restaurant = mapper.readValue(new File("Tests\\restaurant-data.json"), AllRestaurants.class);

            System.out.println(restaurant);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
