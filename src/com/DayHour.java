package com;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DayHour {

    static public Restaurants[] getTime(AllRestaurants RestaurantsList1) throws ParseException {

        Restaurants[] newrestaurants = new Restaurants[RestaurantsList1.restaurants.length];

        System.out.print("Enter Day: ");

        Scanner scanner = new Scanner(System.in);

        String inputDay = scanner.nextLine();

        System.out.println("Enter Time: ");

        String inputTime = scanner.nextLine();

        for (int n = 0; n < RestaurantsList1.restaurants.length; n++) {

            switch (inputDay) {
                case "Monday":
                      String inputMondayTime = RestaurantsList1.restaurants[n].operating_hours.Monday;  // to check if restaurant is closes
                        if (timeComparison(inputTime, inputMondayTime, newrestaurants, n)) {
                            newrestaurants[n] = RestaurantsList1.restaurants[n];
                        } break;
                case "Tuesday":
                    String inputTuesdayTime = RestaurantsList1.restaurants[n].operating_hours.Tuesday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputTuesdayTime, newrestaurants, n)) {
                        newrestaurants[n] = RestaurantsList1.restaurants[n];
                    } break;
                case "Wednesday":
                    String inputWednesdayTime = RestaurantsList1.restaurants[n].operating_hours.Wednesday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputWednesdayTime, newrestaurants, n)) {
                        newrestaurants[n] = RestaurantsList1.restaurants[n];
                    } break;
                case "Thursday":
                    String inputThursdayTime = RestaurantsList1.restaurants[n].operating_hours.Thursday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputThursdayTime, newrestaurants, n)) {
                        newrestaurants[n] = RestaurantsList1.restaurants[n];
                    } break;
                case "Friday":
                    String inputFridayTime = RestaurantsList1.restaurants[n].operating_hours.Friday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputFridayTime, newrestaurants, n)) {
                        newrestaurants[n] = RestaurantsList1.restaurants[n];
                    } break;
                case "Saturday":
                    String inputSaturdayime = RestaurantsList1.restaurants[n].operating_hours.Saturday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputSaturdayime, newrestaurants, n)) {
                        newrestaurants[n] = RestaurantsList1.restaurants[n];
                    } break;
                case "Sunday":
                    String inputSundayime = RestaurantsList1.restaurants[n].operating_hours.Sunday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputSundayime, newrestaurants, n)) {
                        newrestaurants[n] = RestaurantsList1.restaurants[n];
                    } break;
            }
        } return newrestaurants;
    }

    static private boolean timeComparison(String inputTime, String timesofday, Restaurants[] restArray, int n) throws ParseException {

        DateFormat date = new SimpleDateFormat("hh:mm aa"); //setting up the simple date format

        Date date2 = date.parse(inputTime);

        // check comma first

        if (timesofday.matches("Closed")) {
            return false;
        }

        else if (timesofday.matches("Open 24 hours")) {
            return true;
        }

        else if (timesofday.matches("- Sat")){
            return true;
        }

        else {

            String[] splitingcomma = timesofday.split(", ");

            for (int i = 0; i < splitingcomma.length; i++) {
                String[] splitdash = splitingcomma[i].split(" - ");

                Date open = date.parse(splitdash[0]);
                Date closing = date.parse(splitdash[1]);

                if (date2.after(open) && date2.before(closing)) {
                    return true;
                }
            }


        }
        return false;
    }
}
