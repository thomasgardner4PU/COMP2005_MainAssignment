package com;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.*;
import java.text.SimpleDateFormat;

public class DayHour {

    static public Restaurants[] getTime(String inputDay, String inputTime, AllRestaurants RestaurantsList1) throws ParseException {

        List<Restaurants> filtered2 = new ArrayList<>();



        for (int n = 0; n < RestaurantsList1.restaurants.length; n++) {

            switch (inputDay) {
                case "Monday":
                      String inputMondayTime = RestaurantsList1.restaurants[n].operating_hours.Monday;  // to check if restaurant is closes
                        if (timeComparison(inputTime, inputMondayTime, inputDay, RestaurantsList1.restaurants, n)) {
                            filtered2.add(RestaurantsList1.restaurants[n]);
                        } break;
                case "Tuesday":
                    String inputTuesdayTime = RestaurantsList1.restaurants[n].operating_hours.Tuesday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputTuesdayTime, inputDay, RestaurantsList1.restaurants, n)) {
                        filtered2.add(RestaurantsList1.restaurants[n]);
                    } break;
                case "Wednesday":
                    String inputWednesdayTime = RestaurantsList1.restaurants[n].operating_hours.Wednesday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputWednesdayTime, inputDay, RestaurantsList1.restaurants, n)) {
                        filtered2.add(RestaurantsList1.restaurants[n]);
                    } break;
                case "Thursday":
                    String inputThursdayTime = RestaurantsList1.restaurants[n].operating_hours.Thursday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputThursdayTime, inputDay, RestaurantsList1.restaurants, n)) {
                        filtered2.add(RestaurantsList1.restaurants[n]);
                    } break;
                case "Friday":
                    String inputFridayTime = RestaurantsList1.restaurants[n].operating_hours.Friday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputFridayTime, inputDay, RestaurantsList1.restaurants, n)) {
                        filtered2.add(RestaurantsList1.restaurants[n]);
                    } break;
                case "Saturday":
                    String inputSaturdaytime = RestaurantsList1.restaurants[n].operating_hours.Saturday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputSaturdaytime, inputDay, RestaurantsList1.restaurants, n)) {
                        filtered2.add(RestaurantsList1.restaurants[n]);
                    } break;
                case "Sunday":
                    String inputSundaytime = RestaurantsList1.restaurants[n].operating_hours.Sunday;  // to check if restaurant is closes
                    if (timeComparison(inputTime, inputSundaytime, inputDay, RestaurantsList1.restaurants, n)) {
                        filtered2.add(RestaurantsList1.restaurants[n]);
                    } break;
            }
        } return filtered2.toArray(new Restaurants[0]);
    }

    static private boolean timeComparison(String inputTime, String timesofday, String inputDay, Restaurants[] restArray, int n) throws ParseException {

        DateFormat date = new SimpleDateFormat("hh:mm aa"); //setting up the simple date format

        Date date2 = date.parse(inputTime);

        // check comma first

        if (timesofday.matches("Closed")) {
            return false;
        }

        else if (timesofday.matches("Open 24 hours")) {
            return true;
        }

        else if (timesofday.matches("- Sat") && inputDay.equals("Friday") ){
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
