package com.nikita.homework;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Application {
    public static void main(String[] args) {
//        HashMap<String, String> dictionary = new HashMap<String, String>();
        TreeMap<String, String> dictionary = new TreeMap<String, String>();
//        LinkedHashMap<String, String> dictionary = new LinkedHashMap<String, String>();
        dictionary.put("Brave","ready to face and endure danger or pain; showing courage.");
        dictionary.put("Brilliant","exceptionally clever or talented.");
        dictionary.put("Joy","a feeling of great pleasure and happiness.");
        dictionary.put("Confidence","the state of feeling certain about the truth of something.");
        dictionary.put("Brilliant","xxxxxx");

//        for(String word : dictionary.keySet()) {
//            System.out.println(dictionary.get(word));
//        }

        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

    }
}
