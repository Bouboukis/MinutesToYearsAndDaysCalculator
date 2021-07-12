package com.georgioskachrimanis.javacourse;

public class MinutesToYearsDaysCalculator {
    static public void printYearsAndDays (long minutes) {
        if (minutes <= 0) {
            System.out.println("Invalid Value");
        } else {
            long days = (minutes / 60) / 24;
            if (days > 364) {
                days = days % 365;
            }
            long years = (((minutes / 60) / 24) / 365);
            System.out.println(minutes + " min= " + years + " y and " + days + " d");
        }
    }

}
