package mapkitchen;

import java.util.*;

// Abdul Wahab 
// Map, Sets & Collections 

public class Restaurant {

    public static String[] foods = {"pizza", "wings", "kabab", "biryani"};

    public static String[][] cooks = {
        {"PizzaWala", "Doughboy", "Mark", "Brittany"},
        {"Kalia", "Kallan", "Wingmaster", "Ykcalb"},
        {"ARRABBA", "Yefiw,", "Tsirret", "Ravs"},
        {"Raveena,", "Iwib,", "Roma,", "Leely"}};

    public static void main(String[] args) {

        Map<String, Set<String>> cookers = new HashMap(); //creates a basic Hashmap

        for (int i = 0; i < foods.length; i++) {  //iterates through foods array
            String khana = foods[i];     //sets the string khana to the foods in the array
            String[] cooksList = cooks[i];  //sets the string cookList to the cooks in the array

            Set<String> cookerSet = new LinkedHashSet(); //removes duplicates
            for (String cooker : cooksList) { // adds cookers to cookslist
                cookerSet.add(cooker); // same as above
            }

            cookers.put(khana, cookerSet); // puts food (khana) w/ the set of cookers

        }

        Set<String> cooksList = cookers.get("biryani"); //for set String with coksList, get the cookers for biryani

        for (String cooker : cooksList) { // go through string cooker,find each person in the cooksList that cooks biryani
            System.out.println(cooker); // print the biryani cookers.

        }

    }

}
