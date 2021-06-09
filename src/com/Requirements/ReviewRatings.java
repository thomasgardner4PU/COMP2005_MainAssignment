package com.Requirements;

import com.AllRestaurants;
import com.Restaurants;

import java.util.ArrayList;
import java.util.List;

public class ReviewRatings {

    static public List<Restaurants> getRatings(String Rating, AllRestaurants RatingsArray) {
        List<Restaurants> filteredReviews = new ArrayList<>();


        for (int i = 0; i < RatingsArray.restaurants.length; i++) {
            float randingnumber = 0;
            for (int n = 0; n < RatingsArray.restaurants[i].Reviews.length; n++) {
                randingnumber += RatingsArray.restaurants[i].Reviews[n].rating;
            }
            float result = randingnumber/RatingsArray.restaurants[i].reviews.rating;

            if (result > Float.parseFloat(String.valueOf(Rating))) {
                filteredReviews.set(i, RatingsArray.restaurants[i]);
            }
        }
        return filteredReviews;
    }
}
