package com;

import java.util.Scanner;

public class ReviewRatings {

    static public Restaurants[] getRatings(AllRestaurants RatingsArray) {
        Restaurants[] fetchratings = new Restaurants[RatingsArray.restaurants.length];


        System.out.println("Enter Rating: ");

        Scanner scanner = new Scanner(System.in);
        String inputRatingNumber = scanner.nextLine();

        for (int i = 0; i < RatingsArray.restaurants.length; i++) {
            float test = 0;
            for (int n = 0; n < RatingsArray.restaurants[i].reviews.length; n++) {
                test += RatingsArray.restaurants[i].reviews[n].rating;
            }
            float result = test/RatingsArray.restaurants[i].reviews.length;

            if (result > Float.parseFloat(inputRatingNumber)) {
                fetchratings[i] = RatingsArray.restaurants[i];
            }
        }
        return fetchratings;
    }
}
