import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        // Get anniversary dates for Mary, Paul, and Sarah.
        System.out.println("Enter Mary's anniversary (dd-MM-yyyy): ");
        String maryAnniversary = scanner.nextLine();
        Date maryDate = dateFormat.parse(maryAnniversary);
        LocalDate maryLocalDate = dateToLocalDate(maryDate);

        System.out.println("Enter Paul's anniversary (dd-MM-yyyy): ");
        String paulAnniversary = scanner.nextLine();
        Date paulDate = dateFormat.parse(paulAnniversary);
        LocalDate paulLocalDate = dateToLocalDate(paulDate);

        System.out.println("Enter Sarah's anniversary (dd-MM-yyyy): ");
        String sarahAnniversary = scanner.nextLine();
        Date sarahDate = dateFormat.parse(sarahAnniversary);
        LocalDate sarahLocalDate = dateToLocalDate(sarahDate);

        // Calculate the number of years since the anniversaries.
       /* LocalDate currentDate = LocalDate.now();
        long maryYearsPassed = maryLocalDate.until(currentDate).getYears();
        long paulYearsPassed = paulLocalDate.until(currentDate).getYears();
        long sarahYearsPassed = sarahLocalDate.until(currentDate).getYears();*/

        // Check if the years 1995, 2000, and 2010 are leap years.
        boolean is1995Leap = isLeapYear(1995);
        boolean is2000Leap = isLeapYear(2000);
        boolean is2010Leap = isLeapYear(2010); //boolean returns true of false!

        // Print the results.
       /* System.out.println("Years since the anniversaries:");
        System.out.println("Mary: " + maryYearsPassed + " years");
        System.out.println("Paul: " + paulYearsPassed + " years");
        System.out.println("Sarah: " + sarahYearsPassed + " years");*/

        System.out.println("Leap Year Check:");
        System.out.println("1995 is a leap year: " + is1995Leap);
        System.out.println("2000 is a leap year: " + is2000Leap);
        System.out.println("2010 is a leap year: " + is2010Leap);

        // Close the scanner to release resources.
        scanner.close();
    }

    // Helper method to convert Date to LocalDate.
    private static LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }

    // Helper method to check if a year is a leap year.
    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        /*To be a leap year, a year must satisfy the following conditions:
          It is divisible by 4 (i.e., year % 4 == 0).
          It is not divisible by 100 (i.e., year % 100 != 0), unless:
          It is divisible by 400 (i.e., year % 400 == 0).*/
    }
}
