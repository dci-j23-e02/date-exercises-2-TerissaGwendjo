import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;
import java.text.ParseException;


public class AnniversaryReminder{
    public static void main(String[]args) throws ParseException{
        //Create a Scanner object to get user input and instantiate a new dateFormat pattern
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");

        //Ask John to enter the anniversaries of Mary, Paul, and Sarah.
        // and convert the input strings to Date objects.
        System.out.println("Enter Mary's Anniversary (dd-mm-yyyy): ");
        String maryAnniversary = scanner.nextLine();
        Date maryDate = dateFormat.parse(maryAnniversary);

        System.out.println("Enter Paul's Anniversary (dd-mm-yyyy): ");
        String paulAnniversary = scanner.nextLine();
        Date paulDate = dateFormat.parse(paulAnniversary);

        System.out.println("Enter Sarah's Anniversary (dd-mm-yyyy): ");
        String sarahAnniversary = scanner.nextLine();
        Date sarahDate = dateFormat.parse(sarahAnniversary);

        //Close scanner to release resources
        System.out.println("Mary's anniversary is: " + maryDate);
        System.out.println("Paul's anniversary is: " + paulDate);
        System.out.println("Sarah's anniversary is: " + sarahDate);

        scanner.close();
    }
}
