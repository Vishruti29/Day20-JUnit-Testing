package Regex.JUnitTesting;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class UserRegistration {
    public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter your last name: ");
                String lastName = scanner.nextLine();

                // Define regex pattern for last name validation
                Pattern pattern = Pattern.compile("^[A-Z][a-z]{2,}$");

                // Match user input against regex pattern
                Matcher matcher = pattern.matcher(lastName);
                if (matcher.matches()) {
                    System.out.println("Valid last name");
                } else {
                    System.out.println("Invalid last name");
                }
            }
}
