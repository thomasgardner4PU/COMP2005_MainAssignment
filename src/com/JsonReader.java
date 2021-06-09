package com;

import com.Requirements.Cuisineneighbourhood;
import com.Requirements.DayHour;
import com.Requirements.InspectionScores;
import com.Requirements.ReviewRatings;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class JsonReader {

    public static void main(String[] args) throws IOException, URISyntaxException {


        // instance of Restaurants array
        Restaurants[] restaurants = new Restaurants[]{};


        // Try catch method to read and access the json URL
        try {
            ObjectMapper mapper = new ObjectMapper();
            AllRestaurants restaurant = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllRestaurants.class);


            /* User input for returning all Restaurants of specific cuisine and Neighborhood */
            System.out.println("Enter Cuisine: ");
            Scanner scanner = new Scanner(System.in);
            String inputCusineType = scanner.nextLine();


            System.out.println("Enter Neighborhood: ");
            String inputNeighborhood = scanner.nextLine();

            Restaurants[] test = Cuisineneighbourhood.Filter(inputCusineType, inputNeighborhood, restaurant);
            String CuisinenbhoodResults = "Results"; //String variable to store results for debugging

            // advanced for-loop to print out all restaurants of type cuisine in specific neighborhood
            for (Restaurants r:
                    test) {
                System.out.println(r.name);
            }



            /* User input for returning all restaurants that are open on a specific day and hour */
            System.out.print("Enter Day: ");
            Scanner scanner2 = new Scanner(System.in);

            String inputDay = scanner.nextLine();

            System.out.println("Enter Time: ");
            String inputTime = scanner.nextLine();

            Restaurants[] test2 = DayHour.getTime(inputDay, inputTime, restaurant);
            String SecondsetofResults = "Results"; //String variable to store results for debugging

            Restaurants[] DayHourResults = DayHour.getTime(inputDay, inputTime, restaurant);

            // for-loop to print out results from User input
            for (Restaurants r:
                    test2) {
                System.out.println(r.operating_hours.Monday);
            }



            /* User input for returning all restaurants of a specific neighborhood with average review ratings higher than a specific rating*/
            System.out.println("Enter Rating: ");

            Scanner scanner3 = new Scanner(System.in);
            String inputRatingNumber = scanner.nextLine();

            Restaurants[] test3 = ReviewRatings.getRatings(inputRatingNumber, restaurant).toArray(new Restaurants[0]);
            String thirdsetofresults = "Results"; //String variable to store results for debugging

            Restaurants[] reviewResults = DayHour.getTime(inputDay, inputTime, restaurant);

            // for-loop to print out results from User input
            for (Restaurants r:
                    test3) {
                System.out.println(r.reviews.rating);
            }



            /* User input for returning a list of all restaurants in a specific neighbourhood according to their DOHMH inspectionscores in a descending order.*/

            System.out.println("Enter Neighborhood: ");

            Scanner scanner4 = new Scanner(System.in);
            String inputNbhood = scanner.nextLine();

            ArrayList<Restaurants> test4 = InspectionScores.getInspectionScores("Brooklyn", inputNbhood, new AllRestaurants());
            String fourthsetofresults = "Results"; //String variable to store results for debugging

            ArrayList<Restaurants> inspectionresults = InspectionScores.getInspectionScores("Brooklyn", inputNbhood, new AllRestaurants());

            // for-loop to print out results from User input
            for (Restaurants r:
                    test4) {
                System.out.println(r.DOHMH_inspection_score);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
