import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class AnniversaryReminderTeacher {
    public static void main(String[] args) {
        //Step1: store the a-dates in Calendar objects and convert them to date objects
        //Date maryDate = new Date(1995, 5, 20) The year was with extra 100: Y2K Bug,
        // Date constructor is deprecated
        Calendar mary = Calendar.getInstance();
        mary.set(1995,Calendar.JUNE,10);
        Date maryDate = mary.getTime();

        Calendar paul = Calendar.getInstance();
        paul.set(2000,Calendar.JANUARY,20);
        Date paulDate = paul.getTime();

        Calendar sarah = Calendar.getInstance();
        sarah.set(1995,Calendar.JUNE,10);
        Date sarahDate = mary.getTime();

        //print the dates , format the date then print it
        System.out.println("Mary's Anniversary is: " + maryDate);
        System.out.println("Paul's Anniversary is: " + paulDate);
        System.out.println("Sarah's Anniversary is: " + sarahDate);


    }

}

