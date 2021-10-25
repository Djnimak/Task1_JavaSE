package com.nikita.homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application {

    public static void main(String[] args) {
        List<String> animals = new ArrayList<String>();
        animals.add("Lion");
        animals.add("cat");
        animals.add("Dog");
        animals.add("Bird");

//        for(int i = 0; i < animals.size(); i++) {
//            System.out.println(animals.get(i));
//        }
//
//        for(String value : animals) {
//            System.out.println(value);
//        }

        List<Vehicle> vehicles = new LinkedList<Vehicle>();
        Vehicle vehicle2 = new Vehicle("Toyota", "Camery", 12000, false);

        vehicles.add(new Vehicle("Honda", "accord", 12000, false));
        vehicles.add(vehicle2);
        vehicles.add(new Vehicle("Jeep", "Wrangler", 25000, true));

//        for(Vehicle car : vehicles) {
//            System.out.println(car);
//        }

        printElements(vehicles);
        printElements(animals);
    }

    public static void printElements(List someList) {
        for(int i = 0; i < someList.size(); i++) {
            System.out.println(someList.get(i));
        }
    }
}
