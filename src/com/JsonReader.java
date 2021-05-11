package com;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Iterator;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;


public class JsonReader {

    public static void main(String[] args) throws IOException, URISyntaxException {
        // write your code here#

       /* URI uri = ClassLoader.getSystemResource("Restaurents").toURI();
        String mainPath = Paths.get(uri).toString();
        Path path = Paths.get(mainPath , "neighborhood");*/


         ObjectMapper mapper = new ObjectMapper();
        try {
            AllResturants usrPost = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllResturants.class);
            Restaurantcuisine.filterrestaurants(usrPost);
            System.out.println(usrPost);
        } catch (IOException e) {
            e.printStackTrace();
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
