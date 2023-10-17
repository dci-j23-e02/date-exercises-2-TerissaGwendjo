import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) throws ParseException {
        //The SimpleDateFormat class can throw a ParseException.We need to handle this exception or declare it in a throws clause.
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
        LocalDate currentDate = LocalDate.now();
        long maryYearsPassed = maryLocalDate.until(currentDate).getYears();
        long paulYearsPassed = paulLocalDate.until(currentDate).getYears();
        long sarahYearsPassed = sarahLocalDate.until(currentDate).getYears();

        // Print the results.
        System.out.println("Years since the anniversaries:");
        System.out.println("Mary: " + maryYearsPassed + " years");
        System.out.println("Paul: " + paulYearsPassed + " years");
        System.out.println("Sarah: " + sarahYearsPassed + " years");

        // Close the scanner to release resources.
        scanner.close();
    }

    // Helper method to convert Date to LocalDate.
    private static LocalDate dateToLocalDate(Date date) {
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }
}
