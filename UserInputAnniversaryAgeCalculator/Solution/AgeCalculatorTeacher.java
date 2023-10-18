import java.text.SimpleDateFormat;
import java.time.Month;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
public class AgeCalculatorTeacher {
    public static void main(String[]args){

        String pattern = "yyyy.MM.dd";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

        //Using SimpleFormat to format a given date
        Date currentDate = new Date();
        //String date = simpleDateFormat.format(currentDate);
        //String date = SimpleDateFormat.getTimeInstance().format(currentDate); //gives you date and time
        //System.out.println(date);
        DateTimeFormatter DateTimeFormatter = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert  your birthdate here; ");
        System.out.println("Please insert here the year as a number of 4 digits: ");
        String yearString = scanner.nextLine();
        System.out.println("Please insert here the month: ");
        String monthString = scanner.nextLine().toUpperCase();
        System.out.println("Please insert here the day of the month as a number of 2 digits: ");
        String dayString = scanner.nextLine();

        //Build a LocalDate object, of the above strings:
        int year = Integer.parseInt(yearString);
        Month month = Month.valueOf(monthString);   // Class month had to be inserted for this to work
        int day = Integer.parseInt(dayString);

        LocalDate birthdate = LocalDate.of(year,month,day);
        String formattedBirthdate = birthdate.format(formatter);
        System.out.println(year);
        System.out.println(month);
        System.out.println(day);

        System.out.println(birthdate);
        System.out.println(formattedBirthdate);


        //convert local date to date object:
        // Step1: Convert Local Date to Instant object: to include the ZoneId (Time Zone)
        //Step 2: convert the instant object to date object
        //Instant instant = d1.atStartOfDay(ZoneId.systemDefault()).toLocalDate();

        //System.out.println(d1);

    }
}