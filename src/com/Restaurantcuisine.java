package com;

import java.util.Scanner;

public class Restaurantcuisine {

    static public void filterrestaurants(AllResturants allResturants) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("£nter cusine type here from types: Asian, American, Pizza, Mexican");
        String inputCusine = scanner.nextLine();

        System.out.println("Enter Neigborhood here: ");
        String inputNeighborhood = scanner.nextLine();

        AllResturants RestaurantsArray = new AllResturants();

        for (int i = 0; i < allResturants.restaurants.length; i++) { // getting the array and seeing how many restaurants are stored into the lager array
            if (allResturants.restaurants[i].cuisine_type.matches(inputCusine)) {
                if(allResturants.restaurants[i].neighborhood.matches(inputNeighborhood)){
                    System.out.println(allResturants.restaurants[i].id);


                    RestaurantsArray.restaurants[i] = allResturants.restaurants[i];

                    System.out.println(RestaurantsArray);



                }else{
                    System.out.println("No Neigborhood found with this cuisine");
                }
            }else {
                System.out.println("No Cuisine found with selected: " + inputCusine);
            }
        }
    }




}
