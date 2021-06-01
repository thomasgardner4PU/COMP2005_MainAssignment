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
        if (timesofday.indexOf(',') != -1) {
            String[] splitingcomma = timesofday.split(", ");

            String[] splitString1 = splitingcomma[0].split(" - ");
            String[] splitString2 = splitingcomma[1].split(" - ");

            Date var3 = date.parse(splitString1[0]);
            Date var4 = date.parse(splitString1[1]);
            Date var5 = date.parse(splitString2[0]);
            Date var6 = date.parse(splitString2[1]);
            if (date2.after(var3) && date2.before(var4) && date2.after(var5) && date2.after(var6)) {
                return true;
            }
        } else {

            String[] splitString = timesofday.split(" - ");
            Date var1 = date.parse(splitString[0]);
            Date var2 = date.parse(splitString[1]);

            if (date2.after(var1) && date2.before(var2)) {
                //checkes whether the current time is between var1 and var2.
                return true;
            }
        }
        return false;


    }

}
