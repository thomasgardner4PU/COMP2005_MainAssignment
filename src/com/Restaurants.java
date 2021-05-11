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
    public Reviews[] reviews;

    // standard getters and setters

   public String toString() {
        return this.id+ " | " + this.name+ " | " + this.DOHMH_inspection_score+ " | " + this.neighborhood+ " | " + this.photograph+ " | " + this.address+ " | " + this.latlng+ " | " + this.cuisine_type+ " | " + this.operating_hours+ " | " + this.reviews;
    }


}
