package com.nikita.homework.datetime;

import java.time.*;

public class UsingPeriod {

    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2017, Month.JANUARY, 1);
        LocalDate end = LocalDate.of(2017, Month.APRIL, 30);
        Period period = Period.ofWeeks(2);



//        //1
//        cleanAnimalCage(start, end);

//         start.toEpochDay(); // number of days since January 1 1970

//        //2
//        System.out.println(start.plus(period));
//        System.out.println(LocalDateTime.now().plus(period));
//        System.out.println(LocalTime.now().plus(period)); // unsupported unit day

        //3
//        Period yearAndMonth = Period.ofYears(1).ofMonths(1);
        //4
//        Period yearAndMonth = Period.of(1,1,0);
//        System.out.println(yearAndMonth);

        //5
        cleanAnimalCage(start, end, period);
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end, Period period) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plus(period);
        }
    }

    public static void cleanAnimalCage(LocalDate start, LocalDate end) {
        while (start.isBefore(end)) {
            System.out.println("Need to clean the cage on date= " + start);
            start = start.plusMonths(1); // adding 1 month
        }
    }
}
