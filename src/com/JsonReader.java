package com;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonReader {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // write your code here

        Restaurants[] restaurants = new Restaurants[]{};

        try {

            ObjectMapper mapper = new ObjectMapper();

            AllResturants resturants = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllResturants.class);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
