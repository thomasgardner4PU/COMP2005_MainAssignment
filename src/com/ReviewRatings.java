package com;

import java.util.ArrayList;
import java.util.List;

public class ReviewRatings {

    static public List<Restaurants> getRatings(int Rating, AllRestaurants RatingsArray) {
        List<Restaurants> filteredReviews = new ArrayList<>();




        for (int i = 0; i < RatingsArray.restaurants.length; i++) {
            float test = 0;
            for (int n = 0; n < RatingsArray.restaurants[i].reviews.rating; n++) {
                test += RatingsArray.restaurants[i].reviews[n].rating;
            }
            float result = test/RatingsArray.restaurants[i].reviews.rating;

            if (result > Float.parseFloat(String.valueOf(Rating))) {
                filteredReviews.set(i, RatingsArray.restaurants[i]);
            }
        }
        return filteredReviews;
    }
}
