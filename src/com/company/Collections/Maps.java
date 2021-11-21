package com.company.Collections.ListExercise;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Maps {
    public static void main(String[] args) {
        /*
        * Map is collection inteface taht allows to have ke-value pairs in a data structure
        * Maps cannot have duplicate keys
        *
        * A map is indexed using key values, instead a regula key values as 0 1 2 3 4 5 6 7 8 9 ...
        *
        * There are three main implementations of the map
        *  - HashMap: returns a key in a random order so it is irrelevant in which order the key were entered
        *
        *  - ThreeMap: organizes the keys in natural ascending order
        *
        *  - LinkedHashMap: saves the manner in which items were added and returns them in a particular order
        *
        * */

//        Map<String, String> countries = new HashMap<>();
//        countries.put("Nigeria","Abuja");
//        countries.put("Estonia","Tallinn");
//        System.out.println(countries.values());
//
//        for(String country:countries.keySet()){
//            System.out.println("The country is - "+country+" and its' capital is " + countries.get(country));
//        }

        Map<String, String> animalsMap = new TreeMap<>();
        animalsMap.put("Dog","Pup");
        animalsMap.put("Kettle","Calf");
        animalsMap.put("Cat","Kitten");
        animalsMap.put("Dear","Fawn");
        animalsMap.put("Tiger","Cub");

        for (String a:animalsMap.keySet()){
            System.out.println("Adult animal is called " + a + " and little one is "+animalsMap.get(a)+"!");
        }

        }
//exercise for MAP
    //write a program that uses a map to uniquely categorize wild animals and the names of their kids

}
