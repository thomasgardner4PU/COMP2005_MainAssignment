package com.Requirements;

import com.AllRestaurants;
import com.Restaurants;

import java.util.ArrayList;
import java.util.Collections;

public class InspectionScores {

    static public ArrayList<Restaurants> getInspectionScores(String neighborhood, String score, AllRestaurants restaurants) {

        ArrayList<Restaurants> inspectionScores = new ArrayList<>();

        //List<Restaurants> inspection = new ArrayList<>();


        for (int i = 0; i < restaurants.restaurants.length; i++) {
            if (restaurants.restaurants[i].neighborhood.matches(neighborhood)) {
                int n = 0;
                while (n < inspectionScores.size() && Integer.parseInt(restaurants.restaurants[i].DOHMH_inspection_score) > Integer.parseInt(restaurants.restaurants[i].DOHMH_inspection_score)){
                    n++;
                }
                inspectionScores.add(n, restaurants.restaurants[i]);
            }

        }
        Collections.reverse(inspectionScores);
        return inspectionScores;


    }
}
