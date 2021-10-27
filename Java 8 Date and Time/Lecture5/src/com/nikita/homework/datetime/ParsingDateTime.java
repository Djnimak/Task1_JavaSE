package com.nikita.homework.datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

public class ParsingDateTime {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM dd yyyy");
        LocalDate date = LocalDate.parse("02 15 2010", formatter);
        LocalTime time = LocalTime.parse("11:33");

        //1
        System.out.println(date);
        System.out.println(time);

        //2
        String text = date.format(formatter);
        System.out.println(text);

        //3
        LocalDate parsedDate = LocalDate.parse(text, formatter);
        System.out.println(parsedDate);


        LocalDate myDate = LocalDate.of(2010, Month.MAY, 5);
        String dateString = formatter.format(myDate);
        System.out.println(dateString);

        LocalDate anotherDate = LocalDate.parse(dateString, formatter);
        //4
        anotherDate.plusMonths(5).plusDays(5);
        //5
        anotherDate = anotherDate.plusMonths(5).plusDays(5);
        System.out.println(formatter.format(anotherDate));
    }
}
