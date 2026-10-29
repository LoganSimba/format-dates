package com.pluralsight;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {

        //created date formatters to get the format we want
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter format3 = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        DateTimeFormatter format4 = DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");


        //create a localdatetime
        LocalDateTime date = LocalDateTime.now();

        //print to the terminal the current time in different fromats
        System.out.println(date.format(format1));
        System.out.println(date.format(format2));
        System.out.println(date.format(format3));
        System.out.println(date.format(format4));

    }

}
