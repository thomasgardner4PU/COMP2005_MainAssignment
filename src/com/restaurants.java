package com;

import java.util.List;

public class Restaurants<Review> {

    private String ID;
    private String name;
    private int inspectionScore;
    private String neighborhood;
    private String photographyUrl;
    private String address;
    private Double latitude;
    private List<String> operatingHours;
    private List<Review> reviews;

    // standard getters and setters

    ObjectMapper objectMapper = new ObjectMapper();
    Restaurants restaurants = new Restaurants(1, "")

}
