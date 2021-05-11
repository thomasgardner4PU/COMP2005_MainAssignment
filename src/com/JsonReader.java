package com;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import com.fasterxml.jackson.databind.util.JSONPObject;


public class JsonReader {

    public static void main(String[] args) {
        // write your code here#

        ObjectMapper mapper = new ObjectMapper();
        try {
            AllResturants usrPost = mapper.readValue(new URL("http://intelligent-social-robots-ws.com/restaurant-data.json"), AllResturants.class);
            System.out.println(usrPost);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
