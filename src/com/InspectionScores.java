package com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class InspectionScores {

    static public ArrayList<Restaurants> getInspectionScores(AllRestaurants fetchscores) {

        ArrayList<Restaurants> inspectionScores = new ArrayList<>();

        System.out.println("Enter Neighborhood: ");

        Scanner scanner = new Scanner(System.in);
        String inputNeighourhood = scanner.nextLine();

        for (int i = 0; i < fetchscores.restaurants.length; i++) {
            if (fetchscores.restaurants[i].neighborhood.matches(inputNeighourhood)) {
                int n = 0;
                while (n < inspectionScores.size() && fetchscores.restaurants[i].DOHMH_inspection_score > inspectionScores.get(n).DOHMH_inspection_score) {
                    n++;
                }
                inspectionScores.add(n, fetchscores.restaurants[i]);
            }

        }
        Collections.reverse(inspectionScores);
        return inspectionScores;


    }
}
