package com;

import java.util.ArrayList;
import java.util.List;

public class Cuisineneighbourhood {



    static public Restaurants[] Filter(String Cuisine, String Neighboorhood, AllRestaurants RestaurantsList) {

        List<Restaurants> filtered = new ArrayList<>();

        for (int i = 0; i < RestaurantsList.restaurants.length; i++) {
            if (RestaurantsList.restaurants[i].cuisine_type.matches(Cuisine)) {

                if (RestaurantsList.restaurants[i].neighborhood.matches(Neighboorhood)) {
                    filtered.add(RestaurantsList.restaurants[i]);
                }
            }
        }

        return filtered.toArray(new Restaurants[0]);

    }

}
