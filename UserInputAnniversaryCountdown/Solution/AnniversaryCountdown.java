import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class AnniversaryCountdown {
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

        // Calculate the number of days until the next anniversaries using ChronoUnit.
        LocalDate currentDate = LocalDate.now();
        long maryDaysLeft = ChronoUnit.DAYS.between(currentDate, getNextAnniversary(maryLocalDate));
        long paulDaysLeft = ChronoUnit.DAYS.between(currentDate, getNextAnniversary(paulLocalDate));
        long sarahDaysLeft = ChronoUnit.DAYS.between(currentDate, getNextAnniversary(sarahLocalDate));

        // Print the results.
        System.out.println("Days until the next anniversaries:");
        System.out.println("Mary: " + maryDaysLeft + " days");
        System.out.println("Paul: " + paulDaysLeft + " days");
        System.out.println("Sarah: " + sarahDaysLeft + " days");

        // Close the scanner to release resources.
        scanner.close();
    }

    // Helper method to convert Date to LocalDate.
    private static LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }

    // Helper method to calculate the next anniversary date.
    private static LocalDate getNextAnniversary(LocalDate anniversaryDate) {
        LocalDate currentDate = LocalDate.now();
        int currentYear = currentDate.getYear();
        int anniversaryMonth = anniversaryDate.getMonthValue();
        int anniversaryDay = anniversaryDate.getDayOfMonth();

        // If the anniversary date has already occurred this year, calculate for the next year.
        if (currentDate.isAfter(LocalDate.of(currentYear, anniversaryMonth, anniversaryDay))) {
            currentYear++;
        }

        return LocalDate.of(currentYear, anniversaryMonth, anniversaryDay);
    }
}
