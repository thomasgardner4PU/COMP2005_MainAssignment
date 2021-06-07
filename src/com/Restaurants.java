package com;

public class Restaurants {

    public int id;
    public String name;
    public int DOHMH_inspection_score;
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

    public Restaurants(String nbhood, String cuisine) {
        this.neighborhood = nbhood;
        this.cuisine_type = cuisine;
    }

    public Restaurants(OperatingHours day) {
       this.operating_hours = day;
    }

    public Restaurants(Reviews num) {
       this.reviews = num;
    }

    // Empty constructor for deserialization
    public Restaurants() {

    }

}
