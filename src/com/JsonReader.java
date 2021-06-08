package com;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;


public class JsonReader {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // write your code here

        Restaurants[] restaurants = new Restaurants[]{};

        try {

            ObjectMapper mapper = new ObjectMapper();

            AllRestaurants restaurant = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllRestaurants.class);



            System.out.println("Enter Cuisine: ");
        Scanner scanner = new Scanner(System.in);
        String inputCusineType = scanner.nextLine();


        System.out.println("Enter Neighborhood: ");
        String inputNeighborhood = scanner.nextLine();

            Restaurants[] test = Cuisineneighbourhood.Filter(inputCusineType, inputNeighborhood, restaurant);
            String CuisinenbhoodResults = "Results"; //to view the results

            // advanced for loop to make life easy
            for (Restaurants r:
                    test) {
                System.out.println(r.name);
            }

            ///////////////////////////

            System.out.print("Enter Day: ");
        Scanner scanner2 = new Scanner(System.in);

        String inputDay = scanner.nextLine();

        System.out.println("Enter Time: ");
        String inputTime = scanner.nextLine();

            Restaurants[] test2 = DayHour.getTime(inputDay, inputTime, restaurant);
            String SecondsetofResults = "Results";

        Restaurants[] DayHourResults = DayHour.getTime(inputDay, inputTime, restaurant);

            for (Restaurants r:
                    test) {
                System.out.println(r.operating_hours.Monday);
            }

            //////////////////////////////

            System.out.println("Enter Rating: ");

            Scanner scanner3 = new Scanner(System.in);
            String inputRatingNumber = scanner.nextLine();

            Restaurants[] test3 = ReviewRatings.getRatings(inputRatingNumber, restaurant).toArray(new Restaurants[0]);
            String thirdsetofresults = "Results";

            Restaurants[] reviewResults = DayHour.getTime(inputDay, inputTime, restaurant);

            for (Restaurants r:
                    test) {
                System.out.println(r.reviews.rating);
            }

            ///////////////////////////////

            System.out.println("Enter Neighborhood: ");

            Scanner scanner4 = new Scanner(System.in);
            String inputNbhood = scanner.nextLine();

            ArrayList<Restaurants> test4 = InspectionScores.getInspectionScores(inputNbhood, new AllRestaurants());
            String fourthsetofresults = "Results";

            ArrayList<Restaurants> inspectionresults = InspectionScores.getInspectionScores(inputNbhood, new AllRestaurants());

            for (Restaurants r:
                    test) {
                System.out.println(r.DOHMH_inspection_score);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
