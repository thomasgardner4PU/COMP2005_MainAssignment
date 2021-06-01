package com;

import java.util.Scanner;

public class Cuisineneighbourhood {



    static public Restaurants[] Filter(AllRestaurants RestaurantsList) {

        Restaurants[] newrestaurants = new Restaurants[RestaurantsList.restaurants.length];



        System.out.println("Enter Cuisine: ");

        Scanner scanner = new Scanner(System.in);
        String inputCusineType = scanner.nextLine();

        System.out.println("Enter Neighborhood: ");
        String inputNeighborhood = scanner.nextLine();

        for (int i = 0; i < RestaurantsList.restaurants.length; i++) {
            if (RestaurantsList.restaurants[i].cuisine_type.matches(inputCusineType)) {

                if (RestaurantsList.restaurants[i].neighborhood.matches(inputNeighborhood)) {
                    newrestaurants[i] = RestaurantsList.restaurants[i];
                }
            }
        }

        return newrestaurants;

    }

}
