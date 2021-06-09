package com;

public class Restaurants {

    // Objects listed below to match the json data provided in spec
    public int id;
    public String name;
    public String DOHMH_inspection_score;
    public String neighborhood;
    public String photograph;
    public String address;
    public latlng latlng;
    public String cuisine_type;
    public OperatingHours operating_hours;
    public Reviews reviews;
    public com.Reviews[] Reviews;

    // main constructor class
   public String toString() {
        return this.id+ " | " + this.name+ " | " + this.DOHMH_inspection_score+ " | " + this.neighborhood+ " | " + this.photograph+ " | " + this.address+ " | " + this.latlng+ " | " + this.cuisine_type+ " | " + this.operating_hours+ " | " + this.reviews;
    }

    // Restaurants constructor for inspectionScore Unit tests and integration testing
    public Restaurants(String InSpecScore, String Neighboorhood) {

       this.DOHMH_inspection_score = InSpecScore;
       this.neighborhood = Neighboorhood;
    }

    // Restaurants constructor for CuisineNeighborhood Unit tests and integration testing
//    public Restaurants(String nbhood, String cuisine) {
//        this.neighborhood = nbhood;
//        this.cuisine_type = cuisine;
//    }

    // Restaurants constructor for DayHour Unit tests and integration testing
    public Restaurants(OperatingHours day) {
       this.operating_hours = day;
    }

    // Restaurants constructor for ReviewRating Unit tests and integration testing
    public Restaurants(Reviews num) {
       this.reviews = num;
    }

    // Empty constructor for deserialization
    public Restaurants() {

    }

}
