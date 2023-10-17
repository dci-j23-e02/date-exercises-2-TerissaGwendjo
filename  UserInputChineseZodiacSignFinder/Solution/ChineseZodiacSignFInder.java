import java.util.Scanner;

public class ChineseZodiacSignFInder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get birth years for Mary, Paul, and Sarah.
        System.out.print("Enter Mary's birth year: ");
        int maryYear = scanner.nextInt();
        String maryZodiac = getChineseZodiacSign(maryYear);

        System.out.print("Enter Paul's birth year: ");
        int paulYear = scanner.nextInt();
        String paulZodiac = getChineseZodiacSign(paulYear);

        System.out.print("Enter Sarah's birth year: ");
        int sarahYear = scanner.nextInt();
        String sarahZodiac = getChineseZodiacSign(sarahYear);

        // Print the Chinese zodiac signs for each family member.
        System.out.println("Chinese Zodiac Signs:");
        System.out.println("Mary: " + maryZodiac);
        System.out.println("Paul: " + paulZodiac);
        System.out.println("Sarah: " + sarahZodiac);

        // Close the scanner to release resources.
        scanner.close();
    }

    // Helper method to calculate the Chinese zodiac sign based on the birth year.
    public static String getChineseZodiacSign(int birthYear) {
        String[] zodiacSigns = {
                "Rat", "Ox", "Tiger", "Rabbit", "Dragon", "Snake",
                "Horse", "Goat", "Monkey", "Rooster", "Dog", "Pig"
        }; //creating array of the zodiac signs

        // Calculate the zodiac sign based on the birth year.
        int index = (birthYear - 1900) % 12; //The calculation birthYear - 1900 shifts the year's reference point to start from 1900,
        // which is the beginning of the Chinese zodiac cycle. The result of birthYear - 1900 is the number of years elapsed since 1900.
        //Taking the modulus % 12 is used to wrap this number into the range of 0 to 11 (inclusive),
        // which corresponds to the array indices of the Chinese zodiac signs.
        return zodiacSigns[index];
    }
}
