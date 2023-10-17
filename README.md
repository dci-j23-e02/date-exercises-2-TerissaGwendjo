
# Exercise 1: User Input Anniversary Reminder

John is a forgetful person and he always forgets his family members' anniversaries. He wants to create a program that will remind him of his family members' anniversaries. He has three family members: Mary, Paul, and Sarah. Their anniversary dates are as follows:

- Mary: 10th June 1995
- Paul: 20th January 2000
- Sarah: 15th September 2010

Write a Java program using the Date and Calendar classes to store these dates and print them out.

## Steps

1. Import the necessary classes. You will need the `java.util.Scanner`, `java.util.Date` and `java.util.Calendar` classes.
```java
import java.util.Scanner;
import java.util.Date;
import java.util.Calendar;
```
2. Create a Scanner object to get user input.
```java
Scanner scanner = new Scanner(System.in);
```
3. Ask John to enter the anniversaries of Mary, Paul, and Sarah.
```java
System.out.println("Enter Mary's anniversary (dd-mm-yyyy): ");
String maryAnniversary = scanner.nextLine();
System.out.println("Enter Paul's anniversary (dd-mm-yyyy): ");
String paulAnniversary = scanner.nextLine();
System.out.println("Enter Sarah's anniversary (dd-mm-yyyy): ");
String sarahAnniversary = scanner.nextLine();
```
4. Convert the input strings to Date objects.
```java
Date maryDate = new SimpleDateFormat("dd-MM-yyyy").parse(maryAnniversary);
Date paulDate = new SimpleDateFormat("dd-MM-yyyy").parse(paulAnniversary);
Date sarahDate = new SimpleDateFormat("dd-MM-yyyy").parse(sarahAnniversary);
```
5. Print out the anniversaries.
```java
System.out.println("Mary's anniversary is: " + maryDate);
System.out.println("Paul's anniversary is: " + paulDate);
System.out.println("Sarah's anniversary is: " + sarahDate);
```

# Exercise 2: User Input Anniversary Age Calculator

John wants to know how many years have passed since his family members' anniversaries. Write a Java program that calculates the number of years since the anniversaries of Mary, Paul, and Sarah based on their anniversary dates and the current date. Use the `LocalDate` class to achieve this.

Follow the steps from Exercise 1 to get the anniversary dates. Then, calculate the number of years since the anniversaries.

# Exercise 3: User Input Anniversary Leap Year Checker

John heard that anniversaries that fall in a leap year are special. He wants to check if any of his family members' anniversaries fell in a leap year. Write a Java program that checks if the years 1995, 2000, and 2010 are leap years or not.

Follow the steps from Exercise 1 to get the anniversary dates. Then, check if the years are leap years.

# Exercise 4: User Input Anniversary Countdown

John wants to know how many days are left until his family members' next anniversaries. Write a Java program that calculates the number of days until the next anniversary for Mary, Paul, and Sarah.

Follow the steps from Exercise 1 to get the anniversary dates. Then, calculate the number of days until the next anniversaries.

# Exercise 5: User Input Chinese Zodiac Sign Finder

John is interested in Chinese astrology and wants to know the Chinese zodiac signs of his family members. Write a Java program that determines the Chinese zodiac sign of a person based on their birth year.

Follow the steps from Exercise 1 to get the anniversary dates. Then, determine the Chinese zodiac signs.
