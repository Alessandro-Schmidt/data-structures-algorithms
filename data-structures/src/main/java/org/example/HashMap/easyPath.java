package org.example.HashMap;
import java.util.HashMap;


/*
* Just like arraylists but way more user friendly.
* HashMap implements the Map interface (need import)
* similar to arraylist, but with key-values pairs
* stores objects, need to use wrapper class
* (name, email), (username, userID), (country, capital)
*
* This code is based on the implementation of the Bro Code: https://www.youtube.com/watch?v=0dR-YAFFg6I
*
* */

public class easyPath {
    public static void main(String[] args) {
        HashMap<String, String> countries = new HashMap<String, String>();
        countries.put("USA", "United States");
        countries.put("DE", "Germany");
        countries.put("FR", "France");
        countries.put("UR", "Uruguai");
        countries.put("BR", "Brazil");

        countries.remove("BR");

        System.out.println(countries.get("DE"));
        //countries.clear();

        System.out.println(countries.size());

        countries.replace("USA", "Freedom Land");
        System.out.println(countries.containsKey("DE"));

        for(String i: countries.keySet()){
            System.out.print(i+ " / ");
            System.out.println(countries.get(i));
        }

        System.out.println(countries);

    }
}
