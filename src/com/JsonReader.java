package com;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonReader {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // write your code here

       /* URI uri = ClassLoader.getSystemResource("Restaurents").toURI();
        String mainPath = Paths.get(uri).toString();
        Path path = Paths.get(mainPath , "neighborhood");*/

        Restaurants[] restaurants = new Restaurants[]{};

        // AllResturants usrPost = new AllResturants();

         ObjectMapper mapper = new ObjectMapper();
        try {
            restaurants = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), Restaurants[].class);
            //Restaurantcuisine.filterrestaurants(usrPost);
            System.out.println(restaurants);
        } catch (IOException e) {
            e.printStackTrace();
        } //ends try catch
        for (int i = 0; 1 < restaurants.length -1; i++) {
            System.out.println(restaurants[i]);
        }


        /* //read json file data to String
        byte[] jsonData = Files.readAllBytes(Paths.get("http://intelligent-social-robots-ws.com/restaurant-data.json"));

        //create ObjectMapper instance
        ObjectMapper objectMapper = new ObjectMapper();

        //read JSON like DOM Parser
        JsonNode rootNode = objectMapper.readTree(jsonData);
        JsonNode ctnode = rootNode.path("cuisine_type");
        System.out.println("cuisine_type = "+ ctnode.toString());

        JsonNode neighborhoodNode = rootNode.path("neighborhood");
        Iterator<JsonNode> elements = neighborhoodNode.elements();
        while(elements.hasNext()) {
            JsonNode neighborhood = elements.next();
            System.out.println("neighborhood = " + neighborhood.asLong());
        }*/


    }
}
