package com.nikita.homework;

import java.util.*;

public class Application {

    public static void main(String[] args) {
//        ArrayList<Integer> list1 = new ArrayList<Integer>();
//        HashSet<Integer> hashSet = new HashSet<Integer>();
//        hashSet.add(12);
//        hashSet.add(43);
//        hashSet.add(15);
//        hashSet.add(67);
//        hashSet.add(43);
//        hashSet.add(10);

//        HashSet<String> hashSet = new HashSet<String>();
//        hashSet.add("Random");
//        hashSet.add("Tooth Brush");
//        hashSet.add("Computer");
//        hashSet.add("Cloths");

        HashSet<Employee> hashSet = new HashSet<Employee>();
        hashSet.add(new Employee("Mike", 3500, "Accounting"));
        hashSet.add(new Employee("Paul", 3000, "Admin"));
        hashSet.add(new Employee("Peter", 4000, "IT"));
        hashSet.add(new Employee("Angel", 2000, "Maint"));

        ArrayList<Employee> myList = new ArrayList<Employee>(hashSet);

        Collections.sort(myList);

        System.out.println(myList);

//        ArrayList<Integer> myList = new ArrayList<Integer>(hashSet);

//        ArrayList<String> myList = new ArrayList<String>(hashSet);

//        List<Integer> li = new ArrayList<Integer>(list1);
//
//        ArrayList<Integer> newList = new ArrayList<Integer>();
//        newList.add(10);
//        newList.add(67);
//        newList.add(15);

//        list1.addAll(newList);
//        list1.removeAll(newList);
//        list1.clear();

//        boolean hasValue = list1.contains(67);
//        boolean hasValue = list1.contains(48);
//        boolean hasValue = list1.isEmpty();
//        list1.retainAll(newList);
//
//        System.out.println(list1);

    }
}
